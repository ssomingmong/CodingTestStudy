fruits = ['사과','배','배','감','수박','귤','딸기','사과','배','수박']

wants = input('원하는 과일을 입력하시오 : ')

def count_fruits(target):
    count = 0
    for i in range(len(fruits)):
        if fruits[i] == target:
            count += 1
    return count

print(count_fruits(wants))