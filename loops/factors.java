package loops;

import java.util.Scanner;

public class factors {
    public static void factor(int n){
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.print(i+" ");
        }
    }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        System.out.println("the factors are:");
        factor(n);
    }

}
