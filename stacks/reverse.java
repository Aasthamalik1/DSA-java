package stacks;

import java.util.Scanner;
import java.util.Stack;

/*reverse all the elements of stack */
public class reverse {
    public static void ReverseI(Stack<Integer> st){
        Stack<Integer>temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        System.out.print(temp);
        /* time comp:O(n)
         space comp:O(n)
         */
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("enter the size of stack");
        int n=s.nextInt();
        System.out.println("enter elements in stack::");
        for(int i=1;i<=n;i++){
            st.push(s.nextInt());
        }
        System.out.println("reversed stack using extra space:");
        ReverseI(st);
    }
}
