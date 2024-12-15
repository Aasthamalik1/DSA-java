package conditionals;

import java.util.Scanner;

/*take an input from the user and determine that whether the given number is even or odd */
public class evenOdd {
    public static void EvenOdd(int n){
                   if(n%2==0){
                    System.out.println("the number is even");
                   } 
                   else{
                    System.out.println("the number is odd");
                   }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        System.out.println("enter the number");
        EvenOdd(n);
    }
}
