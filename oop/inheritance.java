package oop;
/*implementation of single level inheritance */
class vehicle{
     public void Vehicle(){
        System.out.println("this is a vehicle");
     }
}
class Car extends vehicle{
    public void car(){
        System.out.println("this is a car");
    }
}
/*multi level inheritance implementation */
class maruti extends Car{
    public void Maruti(){
        System.out.println("this is a car of maruti brand");
    }
}

public class inheritance {
    public static void main(String[] args) {
       maruti m1=new maruti();
       m1.Maruti();
       m1.car();
       m1.Vehicle();
    }
}
