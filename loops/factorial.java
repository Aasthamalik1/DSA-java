package loops;
/*given a number n find its factorial */
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=s.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("factorial of a given number is: "+fact);
    }
}
