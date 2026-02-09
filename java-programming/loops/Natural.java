import java.util.Scanner;
public class Natural{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n,i,sum=0;
     n= sc.nextInt();
     i=1;
     while (i<=n) {
        sum = sum +i;
        i++;
     }
     System.out.println(sum);
    }
}