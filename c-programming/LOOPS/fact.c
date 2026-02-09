#include<stdio.h>
int main()
{
	int n,f=1,i=1;
	printf("enter n\n");
	scanf("%d",&n);
	while(i<=n)
	{
		f=n*i;
		i++;
	}
		printf("%d",f);
	
}