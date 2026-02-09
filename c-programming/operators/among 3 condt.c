#include<stdio.h>
int main()
{
	int a,b,c;
	printf("enter a,b,c\n");
	scanf("%d%d%d",&a,&b,&c);
	(a>b&&a>c)?printf("a is greater"):(b>c)?printf("b is greater"):printf("c is greater");
}