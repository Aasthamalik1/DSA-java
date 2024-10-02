package conditionals;
/*given the sides of triangle.check weather the given sides form a valid triangle or not.if they form then find its type{equilateral,isoceles,scalene} */
import java.util.Scanner;
public class CheckTriangle {
    public static void checkTriangle(int s1,int s2,int s3){
        if(s1==s2&&s2==s3){
            System.out.println("the given sides form equilateral triangle");
        }
        else if(s1==s2||s2==s3||s3==s1){
            System.out.println("the given sides form an isoceles triangle");
        }
        else{
            System.out.println("the given sides form scalene triangle");
        }
    }
    public static boolean Istriangle(int s1,int s2,int s3){
        boolean flag=false;
        if(s1+s2>s3||s2+s3>s1||s1+s3>s2){
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first side of triangle:");
        int s1=s.nextInt();
        System.out.println("enter the second side of triangle: ");
        int s2=s.nextInt();
        System.out.println("enter the third side of triangle: ");
        int s3=s.nextInt();
        if(Istriangle(s1,s2,s3)){
            checkTriangle(s1, s2, s3);
        }
        else{
            System.out.println("triangle with these sides are not possible");
        }
    }
}
