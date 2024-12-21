package patternPrinting;

import java.util.Scanner;

/*
   1 2 3 4 3 2 1
   1 2 3   3 2 1
   1 2       2 1
   1           1
 */
public class pattern10 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        for(int i=n-1;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=i;k++){
               System.out.print(" "+" ");
            }
            if(i>=2){
                for(int j=1;j<i;j++){
                    System.out.print(" "+" ");
                }
            }
            int p=n-i;
            for(int l=1;l<=n-i;l++){
               System.out.print(p+" ");
               p--;
            }
            
            System.out.println();
        }
    }
}
