package strings;
/*calculate all substring of a given string */

import java.util.Scanner;

public class substring {
    public static void PrintSubstring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                System.out.print(str.substring(i, j)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        System.out.println("substrings of the given string: ");
        PrintSubstring(str);
    }
}
