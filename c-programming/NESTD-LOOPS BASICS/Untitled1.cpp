#include<stdio.h>
int main()
{
int a,b,c;
printf("a,b,c\n");
scanf("%d%d%d",&a,&b,&c);
printf("%d\n",a>b&&a<c);
printf("%d\n",a>b||a<c);
printf("%d\n",!(a>b&&a<c));
}


