#include<stdio.h>
int hcf(int,int);
int main()
{
	int a,b;
	printf("a,b\n");
	scanf("%d %d",&a,&b);
    int h=hcf(a,b);
	printf("%d",h);
	}
int hcf(int a,int b)
	{
		if(b!=0)
		return hcf(b,a%b);
		else 
	   return a;
	}
	


	
