package strings;

import java.util.Scanner;

/*take a string as input from user and return count of vowels */
public class vowel {
    public static int count(String str){
        int c=0;
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                 c++;
            }
         }
         return c;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        System.out.println("number of vowels in the given string: "+count(str));
    }
}
