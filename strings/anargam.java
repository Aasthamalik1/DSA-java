package strings;

import java.util.Scanner;

public class anargam {
    public static boolean IsAnargam(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string I:");
        String str=s.nextLine();
        System.out.println("enter string II:");
        String str2=s.nextLine();
        if(IsAnargam(str,str2)){
            System.out.println("given strings are anagram");
        }
        else{
            System.out.println("the given strings are not anagram");
        }
    }
}
