#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct Student
{
	int age;
	long long int idno;
	char Name[50];
	char Gen;
}S[3],*p;
int main()
{
	int i;
	p=&S;
	for(i=0;i<3;i++)
	{
		printf("enter the age\n");
		scanf("%d",&p->age);
		printf("enter the idno\n");
		scanf("%lld",&p->idno);
		fflush(stdin);
		puts("enter the name\n");
		gets(p->Name);
		printf("enter the gen\n");
		scanf("%c",&p->Gen);
		p++;
	}
	p=&S;
	for(i=0;i<3;i++)
	{
		printf("AGE = %d\n",p->age);
		printf("ID = %lld\n",p->idno);
		puts(p->Name);
		printf("Gender = %c\n",p->Gen);
		p++;
		
	}
}