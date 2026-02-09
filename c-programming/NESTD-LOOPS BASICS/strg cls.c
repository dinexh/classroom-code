#include<stdio.h>
void m1();
main()
{
	m1();
	m1();
	m1();
}
''void m1()
{
	auto int a=2;
	printf("%d",a);
	a++;
	}