#include<stdio.h>
main()
{
	int a,b;
	printf(" enter values of a,b\n");
	scanf("%d%d",&a,&b);
	printf("a&b = %d\n",a&b);
	printf("a|b = %d\n",a|b);
	printf("a^b = %d\n",a^b);
	printf("~b = %d\n",~b);
	printf("a>>3 = %d\n",a>>3);
	printf("b<<4 = %d\n",b<<4);
}