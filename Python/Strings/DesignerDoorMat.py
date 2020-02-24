def main():
	r, c = map(int,raw_input().split(" "))
	
	for i in range(0,(r+2)/2):
		n = (i) * 2 + 1
		
		if i == r/2:
			print "WELCOME".center(c,"-")
		else:
			print (".|."*n).center(c,"-")
	
	for i in range((r+2)/2 - 2 , -1, -1):
		n = (i) * 2 +1
		print (".|."*n).center(c,"-")
		
if __name__ == '__main__':
	main()
