package loops;
import java.util.Scanner;
/*find sum of first n natural numbers */
public class SumNaturalNum {
    public static int  Sum(int n){
       int s= 0;
       for(int i=1;i<=n;i++){
        s=s+i;
       }
       return s;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("enter the number of terms");
        int n=s.nextInt();
        System.out.println("the sum of "+n+" natural numbers is: "+Sum(n));
    }
}
