if __name__ == '__main__':
    A = set(map(int,input().split()))
    is_strict_superset = True
    for _ in range(int(input())):
        list_N = set(map(int,input().split()))
        is_strict_superset = len(A) > len(list_N) and list_N.issubset(A)
        if not is_strict_superset:
            break
    print(is_strict_superset)
