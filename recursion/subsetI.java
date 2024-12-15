package recursion;

import java.util.Scanner;

public class subsetI {
    public static void subset(int i,String str,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        subset(i+1, str, ans+str.charAt(i));
        subset(i+1, str, ans);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        subset(0, str, "");
    }
}
