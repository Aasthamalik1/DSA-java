package patternPrinting;

import java.util.Scanner;

/*
   1
   21
   321
   4321
 */
public class pattern7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            int p=i;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p--;
            }
            System.out.println();
        }
    }
}
