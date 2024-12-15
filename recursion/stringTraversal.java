package recursion;

import java.util.Scanner;

public class stringTraversal {
    public static void Print(int n ,String str){
        if(n<0){
            return;
        }
        Print(n-1, str);
        System.out.print(str.charAt(n));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        Print(str.length()-1, str);
    }
}
