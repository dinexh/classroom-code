#include<stdio.h>
main()
{
	int n;
	printf("enter n :\n");
	scanf("%d",&n);
	int a[n],i,search,f=0,UB,LB,mid;
	printf("entr the array elements :\n");
    
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf(" enetr search");
	scanf("%d",&search);
	LB=0;
	UB=n-1;
	while(LB<=UB)
	{
		mid=(LB+UB)/2;
		if(a[mid]>search)
		{
			UB=mid-1;
		}
		else if(a[mid]<search)
		{
			LB=mid+1;
		}
		else
		{
			f=1;
			break;
		}
	}
	if(f==1)
	{
		printf("element is founded at the position = %d",i);
	}
	else
	{
		printf("element is not found");
	}
}