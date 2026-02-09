#include<stdio.h>
int main()
{
	int n,s=0,r,m;
	printf("enter n\n");
	scanf("%d",&n);
	m=n;
	while(n>0)
	{
		r=n%10;
		s=s*10+r;
		n=n/10;
	if(m==s)
		printf("YES IT IS A PALINDROME\n");
		else
		printf("NOT A PALINDROME\n");
	}
	

}