package patternPrinting;

import java.util.Scanner;

/*
       1 1 1 1
       2 2 2 2
       3 3 3 3
       4 4 4 4
 */
public class pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
