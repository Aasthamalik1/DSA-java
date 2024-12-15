package conditionals;

import java.util.Scanner;

/*take percentage as input from user and print the grade coreesponding to it
 81-100: very good
 61-80:good
 41-60:average
 below 40: fail
 */
public class grade {
    public static void printGrade(int n){
        if(n>=81){
            System.out.println("very good");
        }
        else if(n>=61){
            System.out.println("good");
        }
        else if(n>=41){
            System.out.println("average");
        }
        else
        {
            System.out.println("fail");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter percentage");
        int n=s.nextInt();
        printGrade(n);
    }
}
