package methods;

import java.util.Scanner;

/*write a method that print square of first n natural number */
public class square {
    public static void printSquare(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i*i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        printSquare(n);
    }
}
