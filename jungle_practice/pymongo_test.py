import requests

from bs4 import BeautifulSoup
from pymongo import MongoClient           # pymongo를 임포트 하기(패키지 인스톨 먼저 해야겠죠?)

client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트로 돌아갑니다.
db = client.dbjungle           

def insert_all():
    # URL을 읽어서 HTML를 받아오고,
    headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
    data = requests.get('https://www.imdb.com/chart/top/?ref_=nv_mv_250', headers=headers)
    
    # HTML을 BeautifulSoup이라는 라이브러리를 활용해 검색하기 용이한 상태로 만듦
    soup = BeautifulSoup(data.text, 'html.parser')

    # select를 이용해서, li들을 불러오기
    movies = soup.select('.ipc-metadata-list > li')
    print(len(movies))

    # movies (li들) 의 반복문을 돌리기
    for movie in movies:
        # movie 안에 a 가 있으면,
        # (조건을 만족하는 첫 번째 요소, 없으면 None을 반환한다.)
        tag_element = movie.select_one('.ipc-title-link-wrapper > h3')
        if not tag_element:
            continue

        # 영화번호.영화 제목 가져오기.
        title = tag_element.text.strip()

        # 영화 개봉 연도 가져오기
        released_year = movie.select_one('.cli-title-metadata-item:nth-child(1)').text
        # 영화 개봉 연도의 타입을 int로 변환
        released_year = int(released_year)

        # 영화 상영시간 가져오기
        running_time = movie.select_one('.cli-title-metadata-item:nth-child(2)').text

        # 영화 상영시간 분으로 변환하기
        # 1. running_time에서 'h'와 'm'을 제거
        running_time = running_time.replace("h", "").replace("m", "")  # "2 55"로 변경

        # 2. 공백으로 나누기
        hours, minutes = running_time.split(" ")  # "2"와 "55"로 분리

        # 3. 문자열을 숫자로 변환
        hours = int(hours)
        minutes = int(minutes)

        # 4. 시간과 분을 계산
        running_time_minutes = hours * 60 + minutes

        # 영상물 등급 가져오기
        pg_level = movie.select_one('.cli-title-metadata-item:nth-child(3)').text

				# ************ 추가 *************
        doc = { 
            'title': title,
            'released_year': released_year,
            'running_time': running_time_minutes,
            'pg_level': pg_level,
        }
        # ************ 추가 *************

        db.movies.insert_one(doc) # 추가

        print("완료", title, released_year, running_time_minutes, pg_level)

if __name__ == '__main__':
		# 생성된 movices collection 제거
    db.movies.drop() # 추가
    # 영화 사이트를 scraping 해서 db에 채우기
    insert_all()