import java.util.Scanner;

public class Avgtwo{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		int avg;
		avg=(a+b+c)/3;
		System.out.println(avg);
	}
}
