#include<stdio.h>
main()
{
	int n;
	printf("enter the value of n\n");
	scanf("%d",&n);
	int a[n],i;
	printf("enter the values of array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
 {    if(a[i]%3==0 && a[i]%5==0)
    {
     printf("%d",a[i]);
	}
	
 }
}