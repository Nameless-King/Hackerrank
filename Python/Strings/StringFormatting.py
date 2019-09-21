def print_formatted(number):
    max_num = int(number)
    pad_amount = len("{0:b}".format(max_num))+1
    for i in range(1,max_num+1):
        o_s = "{0:o}".format(i)
        x_s = "{0:X}".format(i)
        b_s = "{0:b}".format(i)
        print(str(i).rjust(pad_amount),end="")
        print(o_s.rjust(pad_amount),end="")
        print(x_s.rjust(pad_amount),end="")
        print(b_s.rjust(pad_amount),end="")
        print()

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
