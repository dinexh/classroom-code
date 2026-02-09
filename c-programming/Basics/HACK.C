#include<stdio.h>
#include<math.h>
int main()
{
	int x1,x2,y2,D,y1;
	scanf("%d%d%d%d",&x1,&x2,&y1,&y2);
D=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	printf("%d",D);
}