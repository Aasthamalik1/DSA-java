package patternPrinting;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*n-1);j++){
                if(i==j){
                    System.out.print("*"+" ");
                }
                else if(j==(2*n-i)){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
