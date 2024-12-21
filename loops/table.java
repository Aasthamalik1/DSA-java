package loops;
/*take N from user and prints its multiplication table */

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
}
