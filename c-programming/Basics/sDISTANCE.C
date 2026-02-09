#include<stdio.h>
main()
{ int u,t,a,s;
printf("distance\n");
scanf("%d%d%d",&u,&t,&a);
s=u*t+0.5*a*t*t;
printf("distance=%d",s);
}