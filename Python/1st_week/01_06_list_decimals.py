input_num = 20

def find_prime_list_under_number(number):
    arr = []

    for i in range(2, number + 1):
        for j in range(2, i):
            if i % j == 0:
                break
        else:
            arr.append(i)
    return arr
result = find_prime_list_under_number(input_num)
print(result)
