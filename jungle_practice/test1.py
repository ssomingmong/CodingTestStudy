import requests
from bs4 import BeautifulSoup

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get('https://www.imdb.com/chart/top/?ref_=nv_mv_250', headers=headers)

soup = BeautifulSoup(data.text, 'html.parser')
movies = soup.select('.cli-parent')

print("1.", movies[0].select_one('h3').text)
print(movies[0].select('.cli-title-metadata-item')[0].text)
print(movies[0].select('.cli-title-metadata-item')[1].text)
print(movies[0].select('.cli-title-metadata-item')[2].text)