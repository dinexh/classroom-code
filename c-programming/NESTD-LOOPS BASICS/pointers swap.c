#include<stdio.h>
int main()
{
	int a,b,*p,*q;
	printf("enter a,b\n");
	scanf("%d%d",&a,&b);
	p=&a;
	q=&b;
	*p=*p+*q;
	*q=*p-*q;
	*p=*p-*q;
	printf("%d %d",a,b);
}