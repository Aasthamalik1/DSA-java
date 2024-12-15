package stacks;
import java.util.ArrayList;
import java.util.Scanner;
public  class arrayImplementation {
    public static class Stacks{
        private ArrayList<Integer>arr=new ArrayList<>();
        private int idx=-1;
     public  int size(){
        return arr.size();
     }
     public void push(int x){
        arr.add(x);
        idx+=1;
     }
     public int peek(){
        if(arr.size()==0){
           System.out.print("underflow");
           return -1;
        }
        return arr.get(idx);
     }
     public boolean isEmpty(){
        if(arr.size()==0){
            return true;
        }
        return false;
     }
     public void display(){
        System.out.print(arr);
     }
     public int pop(){
        if(arr.size()==0){
            System.out.print("stack underflow");
            return -1;
        }
        int ele=arr.get(idx);
        arr.remove(idx);
        idx-=1;
        return ele;
     }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stacks st=new Stacks();
        System.out.println("enter the number of element you want to insert:");
        int n=s.nextInt();
        System.out.println("enter stack elements");
        for(int i=0;i<n;i++){
            st.push(s.nextInt());
        }

        System.out.println("size of stack:"+st.size());
        System.out.println("is stack empty?"+st.isEmpty());
        System.out.println("peek element is:"+st.peek());
        st.display();
        System.out.println();
        System.out.println("element poped"+st.pop());
        
        System.out.println("size of stack:"+st.size());
        st.display();
        
    }
}
