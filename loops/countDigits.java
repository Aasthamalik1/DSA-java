package loops;
import java.util.Scanner;
public class countDigits {
    public static int count(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
         return c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter digit");
        int n=s.nextInt();
        System.out.println("no of digits are: "+count(n));
        count(n);

    }
}

