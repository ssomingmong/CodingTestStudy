from flask import Flask, render_template, jsonify, request
from pymongo import MongoClient
from bson import ObjectId
from datetime import datetime

# Flask 앱 생성
app = Flask(__name__)

# MongoDB 연결
# - 로컬 MongoDB 기본 포트가 27017이라서 그대로 사용
# - dbjungle 라는 DB를 사용 (없으면 자동 생성)
client = MongoClient("localhost", 27017)
db = client.dbjungle


@app.route("/")
def home():
    """
    [화면 렌더링]
    - templates/index.html 파일을 렌더링해서 브라우저에 보여줌
    - 프론트(HTML/JS)는 이 화면에서 Ajax로 백엔드 API를 호출하게 됨
    """
    return render_template("index.html")


@app.route("/api/memos", methods=["GET"])
def list_memos():
    """
    [메모 목록 조회 API]
    - 프론트에서 페이지 로딩 시 /api/memos 로 GET 요청을 보냄
    - 서버는 DB에서 메모들을 읽어와 JSON 형태로 돌려줌

    정렬 규칙:
    - likes(좋아요) 내림차순 (-1)
    - likes가 같으면 created_at(생성시간) 내림차순 (-1)
    => 즉, 좋아요가 많은 카드가 항상 위로 오도록 보장
    """
    memos = list(
        db.memos.find(
            {},
            {"title": 1, "content": 1, "likes": 1, "created_at": 1}
        ).sort([("likes", -1), ("created_at", -1)])
    )

    # MongoDB의 ObjectId는 JSON으로 바로 변환이 불가능해서 문자열로 변환해줘야 함
    for m in memos:
        m["_id"] = str(m["_id"])
        m["likes"] = int(m.get("likes", 0))

        # created_at은 datetime 객체라 JSON으로 바로 못 나가므로 문자열(ISO format)로 변환
        # 프론트에서 사용하지 않으면 내려도 되고 안 내려도 됨.
        if "created_at" in m and m["created_at"] is not None:
            m["created_at"] = m["created_at"].isoformat()

    return jsonify({"result": "success", "memos": memos})


@app.route("/api/memos", methods=["POST"])
def create_memo():
    """
    [메모 생성 API]
    - 프론트에서 상단 입력 폼(제목/내용)에 입력 후 "저장하기"를 누르면 호출됨
    - request.form 으로 넘어온 데이터를 받아서 DB에 저장

    입력값:
    - title: 제목
    - content: 내용
    """
    # form 데이터 읽기
    title = request.form.get("title", "").strip()
    content = request.form.get("content", "").strip()

    # 간단한 검증: 제목/내용이 없으면 저장 실패 처리
    if not title or not content:
        return jsonify({"result": "fail", "msg": "title/content required"}), 400

    # DB에 저장할 문서(document) 구성
    doc = {
        "title": title,
        "content": content,
        "likes": 0,  # 처음 생성 시 좋아요는 0
        "created_at": datetime.utcnow(),  # 생성 시간(UTC 기준)
    }

    # insert_one: 한 개 문서를 컬렉션에 삽입
    inserted = db.memos.insert_one(doc)

    # 생성 성공 시 생성된 id를 문자열로 반환
    return jsonify({"result": "success", "id": str(inserted.inserted_id)})


@app.route("/api/memos/<memo_id>/like", methods=["POST"])
def like_memo(memo_id):
    """
    [좋아요 +1 API]
    - 프론트에서 특정 카드의 '좋아요!'를 클릭하면 호출됨
    - 해당 memo_id에 해당하는 문서의 likes 값을 +1 증가

    핵심:
    - $inc 연산자를 쓰면 DB에서 원자적으로 증가(안전)
    """
    res = db.memos.update_one(
        {"_id": ObjectId(memo_id)},
        {"$inc": {"likes": 1}}
    )

    # matched_count == 0이면 해당 id를 가진 문서가 없다는 의미
    if res.matched_count == 0:
        return jsonify({"result": "fail", "msg": "not found"}), 404

    return jsonify({"result": "success"})


@app.route("/api/memos/<memo_id>", methods=["PUT"])
def update_memo(memo_id):
    """
    [메모 수정 API]
    - 프론트에서 '수정' 버튼 누른 후 입력창(new-title/new-text)에 값 넣고
      '저장' 버튼 누르면 호출됨

    입력값:
    - title: 새 제목
    - content: 새 내용
    """
    title = request.form.get("title", "").strip()
    content = request.form.get("content", "").strip()

    if not title or not content:
        return jsonify({"result": "fail", "msg": "title/content required"}), 400

    # $set 으로 title/content만 교체
    res = db.memos.update_one(
        {"_id": ObjectId(memo_id)},
        {"$set": {"title": title, "content": content}}
    )

    if res.matched_count == 0:
        return jsonify({"result": "fail", "msg": "not found"}), 404

    return jsonify({"result": "success"})


@app.route("/api/memos/<memo_id>", methods=["DELETE"])
def delete_memo(memo_id):
    """
    [메모 삭제 API]
    - 프론트에서 '삭제' 버튼 클릭 시 호출됨
    - 해당 memo_id 문서를 DB에서 제거
    """
    res = db.memos.delete_one({"_id": ObjectId(memo_id)})

    if res.deleted_count == 0:
        return jsonify({"result": "fail", "msg": "not found"}), 404

    return jsonify({"result": "success"})


if __name__ == "__main__":
    """
    로컬 실행용 엔트리포인트
    - debug=True: 개발 중 에러 화면, 자동 리로드
    - 배포 시에는 debug=False로 두어야 함
    """
    app.run("0.0.0.0", port=5000, debug=True)
