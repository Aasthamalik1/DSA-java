package conditionals;

import java.util.Scanner;

public class absolute {
    public static int Absolute(int n){
        if(n>=0){
            return n;
        }
        else{
            return -n;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        System.out.println("absolute value of given number is: "+Absolute(n));
    }
}
