if __name__ == '__main__':
    input()
    s = set(map(int,input().split()))
    for _ in range(int(input())):
        current = input().split(" ")
        if len(current) >1:
            command = current[0]
            item = int(current[1])
            if command == "remove":
                s.remove(item)
            else:
                s.discard(item)
        else:
            s.pop()
    print(sum(map(int,s)))
