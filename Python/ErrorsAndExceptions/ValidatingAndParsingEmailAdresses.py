import re

EMAIL_PATTERN = "^[A-Za-z]{1}[a-zA-Z0-9\\.-_]{1,}@[A-Za-z]{1,}\\.[A-Za-z]{1,}"

def main():
	iter = int(raw_input())
	
	for _ in range(iter):
		name, email = raw_input().split(" ")
		
		email = email.strip('<','>')
			
		pattern_match = re.match(EMAIL_PATTERN,email)
		
		if pattern_match != None:
			print name,email	
			
		
	
if __name__ == '__main__':
	main()
