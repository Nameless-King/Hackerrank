def wrap(string, max_width):
    if len(string) > max_width:
        result = string[0:max_width]+"\n"
        return result + wrap(string[max_width:],max_width)
    else:
        return string

def main():
    s = input()
    w = int(input())
    result = wrap(w,s)
    print(result)

if __name__ == '__main__':
    main()
