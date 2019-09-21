#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int main(){
	int cases;
	
	scanf("%d\n",&cases);
	
	for(int i = 0;i<cases;i++){
		char line[10000];
		
		scanf("%[^\n]%*c",&line);
		
	
		for(int j = 0;j<strlen(line);j+=2){
			printf("%c",line[j]);
			
		}
		printf(" ");
		for(int j = 1;j<strlen(line);j+=2){
			printf("%c",line[j]);
		}
		printf("\n");
		
		
	}
	return 0;
}