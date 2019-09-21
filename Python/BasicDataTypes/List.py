if __name__ == '__main__':
    l = []
    for _ in range(int(input())):
        command = input().strip().split(" ")
        if len(command) == 1:
            if command[0] == "print":
                print(l)
            elif command[0] == "pop":
                l.pop()
            elif command[0] == "sort":
                l.sort()
            elif command[0] == "reverse":
                l.reverse()
        if len(command) == 2:
            if command[0] == "remove":
                l.remove(int(command[1]))
            elif command[0] ==  "append":
                l.append(int(command[1]))
        if len(command) == 3:
            l.insert(int(command[1]),int(command[2]))
    
