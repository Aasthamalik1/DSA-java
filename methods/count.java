package methods;
/*Write a method to count the number of digits in a number and then print the square of this number. */

import java.util.Scanner;

public class count {
    public static int SquareOfCount(int n){
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c*c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        System.out.println("square of number of digits in the given number is: "+SquareOfCount(n));
    }
}
