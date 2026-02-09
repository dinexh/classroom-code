import java.util.Scanner;
public class SumDO{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n,i,sum=0;
     n= sc.nextInt();
     i=1;
     do{
        sum=sum+i;
        i++;
     }while(i<=n);
     System.out.println(sum);
    }
}