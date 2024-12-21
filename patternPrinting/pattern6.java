package patternPrinting;

import java.util.Scanner;
/*
     ******
     **
     **                 n=5
     **
     ******
 */

public class pattern6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
                for(int j=1;j<=6;j++){
                    System.out.print("*"+" ");
                }
            }
            else{
                for(int j=1;j<=2;j++){
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
        
    }
}
