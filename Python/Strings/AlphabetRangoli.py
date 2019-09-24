def rangoli_it(size,noodle):
    just = size*2 - 1
    return noodle.center(just,"-")

def rangoli_stranboli(start, end):
    offset = 96
    l  = [ chr(start+offset)]
    for i in range(start+offset+1,end+offset+1):
        l.insert(0,chr(i))
        l.append(chr(i))
    return "-".join(l)

def print_rangoli(size):
    horse_shape = []
    for i in range(1,size+1):

        noodle = rangoli_stranboli(i,size)
        pasta = rangoli_it(size*2-1,noodle)
        horse_shape.append(pasta)

    ravenous_pigs = list(reversed(horse_shape[1:]))
    big_E_cheese =  ravenous_pigs + horse_shape 
    for dog_spagett in big_E_cheese:
        print(dog_spagett)

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
