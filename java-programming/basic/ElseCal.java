import java.util.Scanner;
public class ElseCal{
	public static void main (String[] args){
			Scanner input = new Scanner(System.in);
			int a,b,c;
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextint();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else 
		System.out.println("C is greater");
	}
}
