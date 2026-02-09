#include<stdlib.h>
int main()
{
	int *ptr,i,n,sum=0;
	printf("enter the no of elemnts you wnt to allocate \n");
	scanf("%d",&n);
	ptr=(int *) calloc(n,sizeof(int));
	for(i=0;i<n;i++)
	{
	scanf("%d",(ptr+i));
}
	for(i=0;i<n;i--)
	{
	printf("%d",(ptr+i));
}
	return 0;
}