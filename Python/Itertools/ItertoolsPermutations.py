from itertools import permutations

def main():
	word, group = raw_input().split(" ")
	
	letter_sequence = list(word)
	num = int(group)
	
	perms = sorted(list(permutations(letter_sequence,num)))
	
	for perm in perms:
		print "".join(perm)
	
if __name__ == '__main__':
	main()
