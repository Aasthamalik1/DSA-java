package patternPrinting;

import java.util.Scanner;

/*
  A
  1 2
  A B C 
  1 2 3 4
 */
public class pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if(i%2!=0){
                System.out.print((char)(64+j)+" ");
            }
            else{
                System.out.print(j+" ");
            }
            }
            System.out.println();
        }
    }
}
