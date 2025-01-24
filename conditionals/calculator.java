package conditionals;

import java.util.Scanner;
/*design a calculator using switch case */
public class calculator {
    public static void calc(char ch,int a,int b){
        switch(ch){
            case '+':
              System.out.println(a+b);
              break;
            case '-':
            System.out.println(Math.abs(a-b));  
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case'%':
            System.out.println(a%b);
            break;
            default:
            System.out.println("invalid symbol");

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter second number");
        int b=s.nextInt();
        System.out.println("enter operator");
        char ch=s.nextLine().charAt(0);

        //calc(ch, a, b);
    }
}
