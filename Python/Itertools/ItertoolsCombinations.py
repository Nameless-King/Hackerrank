from itertools import combinations

def main():
	in_data = raw_input().split(" ")
	word = "".join(sorted(list(in_data[0])))
	num = int(in_data[1])
	
	for size in range(1,num+1):
		comb_group = list(combinations(word,size))
		for comb in comb_group:
			print "".join(comb)
			
if __name__ == '__main__':
	main()
