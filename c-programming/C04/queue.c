#include<Stdio.h>
#define max 10
int queue[max];
int f=-1;
int r=-1;
void enqueue();
void dequeue();
void display();
main()
{
	int choice;
	do
	{
		printf("1.enqueue\n");
		printf("2.dequeue\n");
		printf("3.display\n");
		printf("Input Your Choice\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				enqueue();
			case 2:
				dequeue();
			case 3:
				display();
			default:
				printf("Wrong option\n");
		}
	}while(choice>1||choice<3);
}
void enqueue()
{
	int ele;
	if(f==max-1)
	printf("Overflow");
	else
	{
		if(f==-1)
		f=0;
		printf("Enter the ele\n");
		scanf("%d",&ele);
		
	}
}




void dequeue()
{
	int ele;
	if(f==-1||f>r)
	printf("UnderFlow\n");
	else
	{
		ele=queue[f];
		printf("%d element is deleted",ele);
		f++;
	}
}
void display()
{
	int i;
	if(f==-1||f>r)
	printf("UnderFlow\n");
	else
	{
		for(i=f;i<r;i++)
		{
			printf("%3d",queue[i]);
		}
	}
}
