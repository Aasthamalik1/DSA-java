package conditionals;

import java.util.Scanner;

/*determine whether the area of rectangle is greater than its perimeter */
public class rectAp {
    public static boolean isGreater(int l,int b){
        int p=2*(l+b);
        int area=l*b;
        if(area>p) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length: ");
        int l=s.nextInt();
        System.out.println("enter breadth: ");
        int b=s.nextInt();
        if(isGreater(l, b)){
            System.out.println("area is greater than perimeter");
        }
        else{
            System.out.println("perimeter is greater than area");
        }
    }
}
