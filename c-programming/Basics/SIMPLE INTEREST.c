//CALCULATe SIMPLE INTEREST//
#include<stdio.h>
main()
{
	int p,t,r;
	float SI;
	printf("enter p,t,r\n");
	scanf("%d%d%d",&p,&t,&r);
	SI = (p*t*r)/100;
	printf("SIMPLE INTEREST = %f",SI);
}