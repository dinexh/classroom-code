#include<stdio.h>
int main()
{
int n,m,s=0,i=1;
printf("enter n\n");
scanf("%d",&n);
while(i<=n)
{
 if(n%i!=0)
 s=s+i;
 i++;
}
if(n>1)
 printf("its not prime");
 else
 printf("its not");

}
