package loops;
/*print the 'n' terms of fibonacci series */
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=s.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;b=c;
        }

    }
}
