import re

def main():
	iter = int(raw_input())
	for _ in range(iter):
		in_data = raw_input()
		try:
			patt = re.compile(in_data)
			print True
		except Exception as e:
			print False
		
if __name__ == '__main__':
	main()
