package patternPrinting;

import java.util.Scanner;
/*
      1
    2   2
  3       3
 4          4
 */
public class pattern13 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==(n-i+1)){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            if(i>=2){
                for(int j=1;j<=i;j++){
                    if(j==i-1){
                        System.out.print(i+" ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
