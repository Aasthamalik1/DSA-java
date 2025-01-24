package conditionals;

import java.util.Scanner;

/* if number is divisible by 3 print Fizz,
if number is divisible by 5 print buzz,
if divisible by both print fizzBuzz
 */
public class fizzBuzz {
    public static void FizzBuzz(int n){
        if(n%3==0&&n%5==0){
            System.out.println("FizzBuzz");
            return;
        }
        if(n%3==0){
            System.out.println("Fizz");
            return;
        }
         if(n%5==0){
            System.out.println("Buzz");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        FizzBuzz(n);
    }
}
