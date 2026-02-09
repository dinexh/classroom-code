#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct Student
{
	int age;
	long long int idno;
	char Name[50];
	char Gen;
}S,*p;
int main()
{
	p=&S;
	printf("enter age\n");
	scanf("%d",&p->age);
	printf("enter idno\n");
	scanf("%lld",&p->idno);
	fflush(stdin);
	puts("enter name\n");
	gets(p->Name);
	printf("enter gen\n");
	scanf("%c",&p->Gen);
	//printing the above values
	printf("AGE = %d\n",p->age);
	printf("ID = %lld\n",p->idno);
	puts(p->Name);
	printf("Gender = %c\n",p->Gen);

}