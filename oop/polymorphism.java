package oop;
/*method overloading */
class overloading{
    public void Display(int n){
        System.out.println(n);
    }
    public void Display(char ch){
        System.out.println(ch);
    }
}
class override{
    public void Display(int n){
        System.out.println(n);
    }
}
class overriding extends override{
   public void Display(String s){
    System.out.println(s);
   }
}
public class polymorphism {
    public static void main(String[] args) {
       // overloading demo=new overloading();
        //demo.Display('a');
        //demo.Display(97);
        overriding demo1=new overriding();
        override demo=new override();
        demo.Display(1);
        demo1.Display("aastha");
    }
}
