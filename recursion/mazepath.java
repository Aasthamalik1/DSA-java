package recursion;

import java.util.Scanner;

public class mazepath {
    public static int maze(int m,int n){
        if(m==1||n==1){
            return 1;
        }
        int right=maze(m,n-1);
        int down=maze(m-1, n);
        return right+down;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter m");
        int m=s.nextInt();
        System.out.println("enter n");
        int n=s.nextInt();
        System.out.println("number of ways "+maze(m, n));
    }
}
