package conditionals;

import java.util.Scanner;
//given a number.Find that whether it is divisible by both 3 and 5
public class isDivisible {
    public static boolean check(int n){
            if(n%3==0&&n%5==0){
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        if(check(n)){
            System.out.println("number is divisible by 3 and 5");
        }
        else{
            System.out.println("number is not divisible by 3 and 5");
        }
    }
}
