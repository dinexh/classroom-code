#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct Student
{
	int age;
	long long int idno;
	char Name[50];
	char Gen;
}S[3];
int main()
{
	int i;
	for(i=0;i<3;i++)
	{
		printf("enter the age\n");
		scanf("%d",&S[i].age);
		printf("enter the idno\n");
		scanf("%lld",&S[i].idno);
		fflush(stdin);
		puts("enter the name\n");
		gets(S[i].Name);
		printf("enter the gen\n");
		scanf("%c",&S[i].Gen);
	}
	for(i=0;i<3;i++)
	{
		printf("AGE = %d\n",S[i].age);
		printf("ID = %lld\n",S[i].idno);
		puts(S[i].Name);
		printf("Gender = %c\n",S[i].Gen);
	}
}