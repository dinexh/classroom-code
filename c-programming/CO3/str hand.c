#include<stdio.h>
#include<string.h>
int main()
{
	char str[100];
	int i,c=0;
	printf("enter the string\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if((str[i]=='t')&&str[i+1]=='h'&&str[i+2]=='e'&&(str[i+3]==32||str[i+3]=='\0'))
		{
			c++;
		}
		
	}
	printf("%d",c);
	return 0;
}