#include<stdio.h>
int main()
{
	int a;
	printf("enter a\n");
	scanf("%d",&a);
	if(a<10)
	{
	printf(" a is a one digit number");
    }
    else if(a<100)
    {
    printf(" a is a two digit number");
	}
	else if(a<1000)
	{
	printf(" a is a three digit number");
		
	}
	else if(a<1000)
	{
	Bill=100*1.25+100*2.25+200*3.25+(Uni-400)*4.25;
	}
	else
	{
		Bill=100*1.25+100*2.25+200*3.25+100*4.25+(Uni-500)*5.25;
	}
	printf("CURRENT BILL= %.2f",Bill);
	}