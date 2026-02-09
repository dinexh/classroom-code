#include<stdio.h>
main()
{
	int n;
	printf("enter the value of n\n");
	scanf("%d",&n);
	int a[n],i;
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("%3d",a[i]);
	}
}