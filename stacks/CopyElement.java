package stacks;
import java.util.Scanner;
import java.util.Stack;


/* copy all the elements of one stack into another stack 
  tc=o(n)
  sc=o(n)
*/
public class CopyElement {
    public static Stack<Integer> Copy(Stack<Integer> st){
           Stack<Integer>temp=new Stack<>();
           while(!st.isEmpty()){
            temp.push(st.pop());
           }
           Stack<Integer> ans=new Stack<>();
           while(!temp.isEmpty()){
            ans.push(temp.pop());
           }
     return ans;
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
       System.out.println("another stack containing the elements of orignal stack in same order:");
       System.out.println(Copy(st));
    }
}
