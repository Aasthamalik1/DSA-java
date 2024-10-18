package stacks;
import java.util.Scanner;
import java.util.Stack;
/*push an element at a given index.Stack use 0 based indexing */
public class pushElement {
    public static void Push(Stack<Integer> st,int index,int element){
       Stack<Integer>temp=new Stack<>();
       while(st.size()>index){
        temp.push(st.pop());
       }
       st.push(element);
       while(!temp.isEmpty()){
        st.push(temp.pop());
       }
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
        System.out.println("enter position");
        int idx=s.nextInt();
        System.out.println("enter element to be inserted:");
        int x=s.nextInt();
        System.out.println("element inserted successfully!! stack after insertion is:");
        Push(st, idx, x);
        System.err.println(st);
    }
}
