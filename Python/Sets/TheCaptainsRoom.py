if __name__ == '__main__':
    input()
    rooms = map(int,input().split())
    s0 = set()
    s1 = set()
    for room in rooms:
        if room in s0:
            s1.add(room)
        else:
            s0.add(room)
    cap_room = s0.difference(s1)
    print(cap_room.pop())
