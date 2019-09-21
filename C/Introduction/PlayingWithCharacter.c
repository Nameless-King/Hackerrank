#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(){
	char c;
	char word[128];
	char line[1024];
	
	scanf("%c",&c);
	scanf("%s\n",&word);
	scanf("%[^\n]%*c",&line);
	
	printf("%c\n",c);
	printf("%s\n",word):
	printf("%s\n",line);
	
	return 0;
}