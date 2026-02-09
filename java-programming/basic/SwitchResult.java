import java.util.Scanner;
public class SwitchResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,r;
        System.out.println("Input marks: ");
        m = sc.nextInt();
        r=m/10;
        switch (r) {
            case 10:
            case 9:        
            case 8:
            case 7:
                System.out.println("Distention");
                break;
            case 6:
                System.out.println("First Class");
                break;
            case 5:
                System.out.println("Second class");
                break;
            case 4:
                System.out.println("Third class");
                break;
                case 3:
                case 2:
                case 1:
                //System.out.println("Third class");
                //break;
                case 0:
                    System.out.println("Failed");
                break;
            default:
                break;
        }
    }
}
