def count_substring(string, sub_string):
    matches = 0
    for _ in range(len(string) - (len(sub_string)-1)):
        if string[_:_+len(sub_string)] == sub_string:
            matches += 1
    return matches

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
