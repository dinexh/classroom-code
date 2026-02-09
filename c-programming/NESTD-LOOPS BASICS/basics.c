#include<stdio.h>
int main()
{
	int n,m,i,j;
	printf("no of rows: ");
	scanf("%d",&n);
	printf("no of coloumns: ");
	scanf("%d",&m);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
	   {
		printf("*");
       }
	printf("\n");
	}
	
}