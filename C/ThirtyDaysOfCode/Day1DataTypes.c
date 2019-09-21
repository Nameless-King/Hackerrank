#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(){
	int i = 4;
	double d = 4.0;
	char s[] = "HackerRank ";
	
	int inInt;
	double inDouble;
	char inString[105];
	
	scanf("%d",&inInt);
	scanf("%lf",&inDouble);

	scanf("\n%[^\n]",&inString);
	

	
	printf("%d\n",inInt+i);
	printf("%.1f\n",inDouble+d);

	printf("%s%s",s,inString);
	
	return 0;
}