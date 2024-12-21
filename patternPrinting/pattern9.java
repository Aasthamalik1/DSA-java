package patternPrinting;

import java.util.Scanner;

/*
    
             A
            BAB
           CBABC
          DCBABCD
 */
public class pattern9 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" "+" ");
            }
            int p=i;
            for(int j=1;j<=i;j++){
               System.out.print((char)(64+p)+" ");
               p--;
            }
            if(i>=2){
                for(int j=1;j<i;j++){
                   int r=j+1;
                System.out.print((char)(64+r)+" ");
                }
            }
            else{
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
