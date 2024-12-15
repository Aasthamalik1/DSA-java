package strings;
/*return number of digits in an number without using loop */

import java.util.Scanner;

public class digit {
    public static int count(int n){
        String temp="";
        temp+=n;
        return temp.length();
    }
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number");
    int n=s.nextInt();
    System.out.println("number of didguts in the given number: "+count(n));
}
}
