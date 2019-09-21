#include <stdio.h>
#include <math.h>

void update(int *a, int *b){
	int sum = *a + *b;
	int absDifference = std::abs(*a - *b);
	*a = sum;
	*b = absDifference;
}

int main(){
	int a,b;
	int *pa = &a,*pb = &b;
	
	std::scanf("%d %d",&a, %b);
	update(pa,pb);
	std::printf("%d\n%d",a,b);
	return 0;
}