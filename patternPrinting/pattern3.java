package patternPrinting;

import java.util.Scanner;

/*
  A
  A B 
  A B C
 */
public class pattern3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
