#include<stdio.h>
#include<string.h>
int main()
{
	FILE *fp;
	char ch;
	fp=fopen("chandu.txt","r");
	ch=getc(fp);
	while(ch!=EOF)
	{
	printf("%c",ch);
		
		ch=getc(fp);
		}
		fclose(fp);
}