package conditionals;

import java.util.Scanner;

/*check wheather the given number is a three digit number or not */
public class isIII {
    public static boolean isThree(int n){
        if(n>99&&n<1000){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        if(isThree(n)){
            System.out.println("yes ,the given number is a three digit number");
        }
        else{
            System.out.println("the given number is not a three digit number");
        }
    }
}
