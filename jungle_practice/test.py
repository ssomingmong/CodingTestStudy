import requests

i = requests.get('http://openapi.seoul.go.kr:8088/6d4d776b466c656533356a4b4b5872/json/RealtimeCityAir/1/99')
rjson = i.json()

for i in range(len(rjson['RealtimeCityAir']['row'])):
    if rjson['RealtimeCityAir']['row'][i]['PM'] < 60:
        print(str(rjson['RealtimeCityAir']['row'][i]['MSRSTN_NM']) + str(rjson['RealtimeCityAir']['row'][i]['PM']))