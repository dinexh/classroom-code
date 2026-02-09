#include<stdio.h>
int main()
{
    int A,B,C;
    scanf("%d%d",&A,&C);
    if(((A+C)/2)%2!=0)
      printf("-1");
    else
    printf("%d",(A+C)/2);
}