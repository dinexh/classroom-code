#include<stdio.h>
main()
{
	int n;
	printf("enter n :\n");
	scanf("%d",&n);
	int a[n],i,search,f=0;
	printf("entr the array elements :\n");
    
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf(" enetr search");
	scanf("%d",&search);
	for(i=0;i<n;i++)
	{
		if(a[i]==search)
		{
			f=1;
			break;
		}
	}
	
	if(f==1)
	{
		printf("element found");
	}
	else
	{
		printf("element is not found");
	}
	
}