from itertools import product

def main():
	a = map(int,raw_input().split(" "))
	b = map(int,raw_input().split(" "))
	
	pairs = product(a,b)
	
	for pair in pairs:
		print pair,
	
if __name__ == '__main__':
	main()
