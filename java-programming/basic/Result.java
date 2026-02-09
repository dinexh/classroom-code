import java.util.Scanner;
public class Result{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=100 && n>=70)
        {
            System.out.println("Distinction");
        }
        else if(n<=70 && n>=60)
        {
            System.out.println("First Class");
        }
        else if(n<=60 && n>=50)
        {
            System.out.println("Second Class");
        }
        else if(n<=50 && n>=40)
        {
            System.out.println("Third Class");
        }
        sc.close();
    }
}