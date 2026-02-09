#include<stdio.h>
#include<string.h>
int main()
{
	FILE *fp;
	char ch;
	fp=fopen("chandu.txt","w");
	ch=getchar();
	while(ch!='.')
	{
		putc(ch,fp);
		ch=getchar();
		}
		fclose(fp);
}