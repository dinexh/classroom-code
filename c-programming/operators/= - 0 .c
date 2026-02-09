#include<stdio.h>
int main()
{
	int a;
	printf(" enter a\n");
	scanf("%d",&a);
	(a>0)?printf("a is positive"):(a==0)?printf("a is eqauls to zero"):printf("a is negative");
}