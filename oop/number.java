package oop;
/*class creation */
public class number {
    int a;
    int b;
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        /*object creation */
        number n=new number();
        /*value assignment to private variables */
        n.a=4;
        n.b=2;
        /*calling member function of class */
        n.sum();
        n.sub();
    }
}
