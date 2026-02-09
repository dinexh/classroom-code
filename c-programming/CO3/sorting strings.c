#include<stdio.h>
#include<string.h>
main()
{
	int i,j;
	char a[7][20];
	char temp[20];
	puts("enter the strings\n");
	for(i<0;i<7;i++)
	{
	gets(a[i]);
    }
	for(i=0;i<7;i++)
	{
	for(j=0;j<7-i;j++)
	{
	if(strcmp(a[j],a[j+1])>0)
	{ 
	strcpy(temp,a[j]);
	strcpy(a[j],a[j+1]);
	strcpy(a[j+1],temp);
      }
	 }
	}
	for(i=0;i<7;i++)
	{
	puts(a[i]);
}
return 0;
}