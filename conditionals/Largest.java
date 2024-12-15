package conditionals;

import java.util.Scanner;

/*find largest of given three numbers */
public class Largest {
    public static int largest(int a,int b,int c){
        if(a>=b&&b>=c){
            return a;
        }
        else if(b>=a&&a>=c){
            return b;
        }
        else return c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter second number");
        int b=s.nextInt();
        System.out.println("enter third number");
        int c=s.nextInt();
        System.out.println("largest of the three number is: "+largest(a, b, c));
    }
}
