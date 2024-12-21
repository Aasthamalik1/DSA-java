package loops;

import java.util.Scanner;

/*print first n natural number */
public class nNatural {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter N");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
