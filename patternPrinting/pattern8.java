package patternPrinting;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            if(i>=2){
                int q=i+1;
                for(int p=2;p<=i;p++){
                    System.out.print(q+" ");
                    q++;
                }
            }
            else{
                System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
