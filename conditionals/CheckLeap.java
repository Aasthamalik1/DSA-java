package conditionals;
/*given a year .find that it is a leap year or not */
import java.util.Scanner;
public class CheckLeap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter year");
        int n=s.nextInt();
        if(n%400==0||n%4==0&&n%100!=0){
            System.out.println("the given year is a leap year");
        }
        else{
            System.out.println("the given year is not a leap year ");
        }
        
    }
}
