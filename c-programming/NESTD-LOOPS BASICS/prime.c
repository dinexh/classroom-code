#include<stdio.h>
int main()
{
	int n,i;
	printf("n\n");
	scanf("%d",&n);
    for(i=2;i<=n/2;i++)
    {
    	if(n%i==0)
    printf("its a prime number");
    else
    printf("its not a prime");
}
return 0;
}