#include<stdio.h>
int main()
{
	int a,i=1,mul;
	printf(" enter a\n");
	scanf("%d",&a);
	while(i<=10)
	{
	mul=a*i;
	printf("%d*%d=%d \n",a,i,mul);
	i++;
}
	
}