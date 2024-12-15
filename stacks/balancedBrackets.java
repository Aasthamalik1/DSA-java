package stacks;

import java.util.Stack;
import java.util.Scanner;
public class balancedBrackets {
    public static boolean Isbalanced(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty()){
              if(s.charAt(i)==')'&&st.peek()==')'){
                st.pop();
               }
               else if(s.charAt(i)=='}'&&st.peek()=='}')
                  {st.pop();
                     }
              else if(s.charAt(i)==']'&&st.peek()==']'){
                System.out.println(s.charAt(i));
                System.out.println(st.pop());
                
               }
            }
        }
        System.err.println(st.size());
           return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the bracket series");
        String str=s.nextLine();
        System.out.println("is balanced brackets?  "+Isbalanced(str));
    }
}
