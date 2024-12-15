package stacks;

public class llImplementation {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class Stack{
        private node head=null;
        private int idx=0;
      public void push(int x){
        node temp=new node(x);
        if(head==null){
            head=temp;
        }
        else
        head.next=temp;
        idx+=1;
       }
       public int size(){
        return idx;
       }
       public int peek(){
        if(head==null){
            System.out.println("stack underflow condition");
            return -1;
        }
        node temp=head;
        while ((temp!=null)) {
            temp=temp.next;
        }
        return temp.val;
       }
       public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
       }
       public void display(){
        node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
       }
       public int pop(){
        if(head==null){
            System.out.println("stack underflow condition");
            return -1;
        }
        while ((head!=null)) {
            temp=temp.next;
        }
        int ele=temp.val;
        
       }
    }

}
