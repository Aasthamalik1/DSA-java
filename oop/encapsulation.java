package oop;
/*implementation of encapsulation.........use of getter and setter method */
class Student{
    private String name;
    private int age;
     public void SetAge(int n){
        age=n;
     }
     public void SetName(String str){
        name=str;
     }
     public int GetAge(){
        return age;
     }
     public String GetName(){
        return name;
     }
}
public class encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.SetAge(10);
        s1.SetName("ankush");
        System.out.println("name of student"+s1.GetName());
        System.out.println("age of student"+s1.GetAge());
    }
}
