#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int getDigitSum(int num);

int main(){
	int n;
	scanf("%d",&n);
	printf("%d\n",getDigitSum(n));
	return 0;
}

int getDigitSum(int num){
	if(num<10){
		return num;
	}
	
	return num%10 + getDigitSum(num/10);
}