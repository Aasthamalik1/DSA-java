package strings;

import java.util.Scanner;

import recursion.staircase;

/*covert string to integer */
public class conversion {
    public static String convert(int n){
        String ans="";
        ans=ans+n;
     return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter integer");
        int n=s.nextInt();
        System.out.println("value converted to string: "+convert(n));
    }
}
