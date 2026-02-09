#include<stdio.h>
int main()
{
	int n,f=0,s=1,next,i;
	printf("enter n\n");
	scanf("%d",&n);
	printf("%d %d",f,s);
	for(i=1;i<=n-2;i++)
	{
		next=f+s;
		printf(" %d",next);
		f=s;
		s=next;
	}
	return 0;
}