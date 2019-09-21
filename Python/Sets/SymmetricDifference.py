input()
s1 = set(map(int,input().split()))
input()
s2 = set(map(int,input().split()))
l = list(s1.symmetric_difference(s2))
l.sort()
[print(item) for item in l]
