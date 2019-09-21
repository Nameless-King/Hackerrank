if __name__ == '__main__':
    s1,s2 = set(),set()

    input()
    [s1.add(s) for s in input().split(" ")]
    input()
    [s2.add(s) for s in input().split(" ")]

    print(len(s1.intersection(s2)))
