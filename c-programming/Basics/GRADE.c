#include<stdio.h>
int main()
{
	int a,f,b,c,d,e;
	float avg;
	printf("enter a,b,c,d,e,f\n");
	scanf("%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f);
	avg=((a+b+c+d+e+f)/6);
	if(avg>=85 && avg<=100)
	{
	printf(" O GRADE ");
    }
    else if(avg>=75 && avg<=85 )
    {
    printf(" A GRADE ");
	}
	else if( avg>=55 && avg<=75)
	{
		printf(" B GRADE");
		
	}
	else if(avg>35 && avg<=55)
	{
		printf(" C GRADE ");
	}
	else
	{
		printf(" FAIL ");
	}
	}