//CALCULATE TOTAL ENERGY//
#include<stdio.h>
#define g 9.8
main()
{ int m,h,v;
float TE;
 printf("m,h,v\n");
 scanf("%d%d%d",&m,&h,&v);
 TE=m*g*h+0.5*m*v*v;
 printf("TOTAL ENERGY = %f",TE);
}	