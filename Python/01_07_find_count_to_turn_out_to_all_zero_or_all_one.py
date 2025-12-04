input = "011110"


def find_count_to_turn_out_to_all_zero_or_all_one(string):
    count_zero = 0
    count_one = 0
    
    if string[0] == '0':
        count_zero += 1
    else:
        count_one += 1
    
    for i in range(1, len(string)):
        if string[i] != string[i - 1]:
            if string[i - 1] == '0':
                count_zero += 1
            else:
                count_one += 1

    return min(count_zero, count_one)


result = find_count_to_turn_out_to_all_zero_or_all_one(input)
print(result)