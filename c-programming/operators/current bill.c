#include<stdio.h>
int main()
{
	int Uni;
	float Bill;
	printf("enter Uni\n");
	scanf("%d",&Uni);
	if(Uni>=1&&Uni<=100)
	{
	Bill=Uni*1.25;
    }
    else if(Uni>=101&&Uni<=200 )
    {
    Bill=100*1.25+(Uni-100)*2.25;
	}
	else if(Uni>=201&&Uni<=400)
	{
	Bill=100*1.25+100*2.25+(Uni-200)*3.25;
		
	}
	else if(Uni>=401&&Uni<=500)
	{
	Bill=100*1.25+100*2.25+200*3.25+(Uni-400)*4.25;
	}
	else
	{
		Bill=100*1.25+100*2.25+200*3.25+100*4.25+(Uni-500)*5.25;
	}
	printf("CURRENT BILL= %.2f",Bill);
	}