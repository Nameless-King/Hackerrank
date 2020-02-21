from itertools import combinations_with_replacement

def main():
	in_data = raw_input().split(" ")
	word = "".join(sorted(list(in_data[0])))
	num = int(in_data[1])
	
	for comb in list(combinations_with_replacement(word,num)):
		print "".join(comb)
	
if __name__ == '__main__':
	main()
