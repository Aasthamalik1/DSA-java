package recursion;

import java.util.Scanner;

// given a string and character ch .we need to remove all occurences of ch from string.
public class remove {
    public static void skip(int i,String str,String ans,char ch){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(i)!=ch){
            ans=ans+str.charAt(i);
        }
        skip(i+1, str, ans, ch);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        System.out.println("enter character");
        char c=s.nextLine().charAt(0);
        skip(0, str, "", c);
    }
}
