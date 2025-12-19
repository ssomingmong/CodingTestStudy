def find_max_occurred_alphabet(string):
    count_alphabet = [0] * 26

    for char in string:
        if char.isalpha():
            index = ord(char) - ord('a')
            count_alphabet[index] += 1

    max_count = 0
    max_alphabet = 'a'

    for i in range(26):
        if count_alphabet[i] > max_count:
            max_count = count_alphabet[i]
            max_alphabet = chr(i + ord('a'))
    
    return max_alphabet

result = find_max_occurred_alphabet
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))