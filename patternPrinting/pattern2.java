package patternPrinting;

import java.util.Scanner;

/*
  1 2 3 4
  1 2 3
  1 2
  1
 */
public class pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
