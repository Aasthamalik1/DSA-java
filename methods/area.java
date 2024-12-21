package methods;

import java.util.Scanner;

/* write a function that take radius as parameter and return area of circle */
public class area {
    public static double Area(double r){
        return 3.14*r*r;
    }
    public static void main(String[] args) {
        System.out.println("enter radius");
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        System.out.println("area of the circle is: "+Area(r));
    }
}
