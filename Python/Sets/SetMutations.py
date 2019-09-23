if __name__ == '__main__':
    input()
    A = set(map(int,input().split()))
    for cases in range(int(input())):
        command = input().split()[0]
        list_N = set(map(int,input().split()))
        if command == "update":
            A.update(list_N)
        elif command == "intersection_update":
            A.intersection_update(list_N)
        elif command == "symmetric_difference_update":
            A.symmetric_difference_update(list_N)
        elif command == "difference_update":
            A.difference_update(list_N)

    print(sum(A))
