package loops;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp=temp+str.charAt(i);
        }
        System.out.println(temp);
        boolean flag=true;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=temp.charAt(i)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("given string is not palindrome");
        }
    }
}
