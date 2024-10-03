package loops;
import java.util.Scanner;
/*given two number need to find their greatest commom divisor */
public class gcd {
    public static int GCD(int a,int b){
        int gcd=1;
        int m=0;
        if(a>b){
           m=a;
        }
        else{
            m=b;
        }
        for(int i=1;i<=m;i++){
            if(a%i==0&&b%i==0){
                if(gcd<i){
                    gcd=i;
                }
            }
        }
        return gcd;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=s.nextInt();
        System.out.println("enter second number: ");
        int b=s.nextInt();
       System.out.println("the gcd of given two number is:"+GCD(a, b));
    }
}
