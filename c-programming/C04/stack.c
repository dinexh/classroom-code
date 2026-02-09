#include<stdio.h>
#define max 10
int top=-1;
int stack[max];
void push();
void pop();
void peep();
void display();
int main(){
	int choice;
	do{
		printf("1.push()\n 2.pop() \n 3.peep()\n 4.display()\n");
		printf("enter your choice\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				push();
				break;
				case 2:
				pop();
					break;
				case 3:
				peep();
					break;
				case 4:
					display();
						break;
					default:
					printf("wrong choice\n");
		}
	}
	while(choice>=1&&choice<=4);
}

void push(){
	int ele;
	if(top==max-1){
		printf("stack is over flow\n");
	} else{	
	printf("enter a element\n");
	scanf("%d",&ele);
	top++;
	stack[top]=ele;
}
}
void pop(){
		int ele;
	if(top==-1){
		printf("stack is under flow\n");
	} else{
		ele=stack[top];
		printf("%d element is deleted\n",ele);
		top--;
	}
}
void peep(){
		int ele;
	if(top==-1){
		printf("stack is under flow\n");
	} else{
		printf(" the top element is %d\n",stack[top]);
	}
}
void display(){
	int i;
	if(top==-1){
		printf("stack is under flow\n");}
		else	{
			for(i=top;i>=0;i--){
				printf("%d",stack[i]);
			}
		}
}
