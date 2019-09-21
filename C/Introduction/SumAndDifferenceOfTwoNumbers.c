#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int main(){
	int a,b;
	double c,d;
	
	scanf("%d%d",&a,&b);
	scanf("%lf%lf",&c, &d);
	
	printf("%d %d\n",(a+b),(a-b));
	double sumD = c+d;
	double differenceD = c-d;
	printf("%.1f %.1f\n",sumD,differenceD);
	
	return 0;
}