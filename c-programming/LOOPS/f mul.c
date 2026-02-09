#include<stdio.h>
int main()
{    int a,i,mul;
printf("enter a\n");
scanf("%d",&a);
for(i=1;i<=10;i++)
{
	mul=a*i;
	printf("%d*%d=%d\n",a,i,mul);
}
}