from flask import Flask, render_template, jsonify, request
from pymongo import MongoClient
from bson import ObjectId
from datetime import datetime, timezone


app = Flask(__name__)

client = MongoClient('mongodb://test:test@3.35.9.111',27017)
db = client.dbjungle


@app.route("/")
def home():

    return render_template("index.html")


@app.route("/api/memos", methods=["GET"])
def list_memos():

    memos = list(db.memos.find({}, {"title": 1, "content": 1, "likes": 1, "created_at": 1}).sort([("likes", -1), ("created_at", -1)]))

    for i in memos:
        i["_id"] = str(i["_id"])
        i["likes"] = int(i["likes"])

    return jsonify({"result": "success", "memos": memos})


@app.route("/api/memos", methods=["POST"])
def create_memo():
    title = request.form.get("title").strip()       #파이썬에서는 trim()을 못쓴다?
    content = request.form.get("content").strip()

    if not title or not content:
        return jsonify({"result": "fail", "msg": "title/content required"})

    doc = {
        "title": title,
        "content": content,
        "likes": 0,
        "created_at": datetime.now(timezone.utc),
    }

    inserted = db.memos.insert_one(doc)

    return jsonify({"result": "success"})


@app.route("/api/memos/<memo_id>/like", methods=["POST"])
def like_memo(memo_id):

    res = db.memos.update_one(
        {"_id": ObjectId(memo_id)},
        {"$inc": {"likes": 1}}      #likes 1 증가
    )

    return jsonify({"result": "success"})


@app.route("/api/memos/<memo_id>", methods=["PUT"])
def update_memo(memo_id):
    
    update_title = request.form.get("title", "").strip()
    update_content = request.form.get("content", "").strip()

    if not update_title or not update_content:
        return jsonify({"result": "fail"})

    res = db.memos.update_one(
        {"_id": ObjectId(memo_id)},
        {"$set": {"title": update_title, "content": update_content}}
    )

    return jsonify({"result": "success"})


@app.route("/api/memos/<memo_id>", methods=["DELETE"])
def delete_memo(memo_id):

    res = db.memos.delete_one({"_id": ObjectId(memo_id)})

    return jsonify({"result": "success"})


if __name__ == "__main__":

    app.run("0.0.0.0", port=5000, debug=True)
