if __name__ == '__main__':
    n = int(input())
    [print(i,end="") for i in range(1,n+1)]
    #also do this with the * iterator operator
    #print(*range(1,n+1),sep="")
