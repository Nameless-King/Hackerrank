def main():
	iter = int(input())
	
	for _ in range(iter):
		try:
			d0 = int(raw_input())
			d1 = int(raw_input())
			print(d0/d1)
		except Exception as e:
			print "Error Code:",e 
		#except ZeroDivisionError as e:
			#print "Error Code:",e
			
if __name__ == '__main__':
	main()
