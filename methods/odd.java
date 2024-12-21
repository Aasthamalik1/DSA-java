package methods;

import java.util.Scanner;

/* write a method that take to values a and b .Print all odd number between a and b */
public class odd {
    public static void PrintOdd(int a,int b){
        for(int i=a;i<=b;i++){
            if(i%2!=0)
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a");
        int a=s.nextInt();
        System.out.println("enter b");
        int b=s.nextInt();
        PrintOdd(a, b);

    }
}
