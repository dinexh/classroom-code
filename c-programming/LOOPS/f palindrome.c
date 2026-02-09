#include<stdio.h>
int main()
{    int n,r,s=0;
printf("enter n\n");
scanf("%d",&n);
for(;n>0;)
{
	r=n%10;
	s=s*10+r;
	n=n/10;
}
	printf("%d\n",s);
}