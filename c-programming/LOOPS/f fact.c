#include<stdio.h>
int main()
{    int n,i=1,f=1;
printf("enter n\n");
scanf("%d",&n);
for(;i<=n;i++)
{
f=f*i;
}
	printf("%d\n",f);
}