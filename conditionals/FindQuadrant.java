package conditionals;
/*given coordinates find their quadrant */
import java.util.Scanner;
public class FindQuadrant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter x coordinate");
        int x=s.nextInt();
        System.out.println("enter y coordinate");
        int y=s.nextInt();
        if(x>0&&y>0){
            System.out.println("the coordinates lies in first quadrant");
        }
        else if(x>0&&y<0){
            System.out.println("the given coordinates lies in second quadrant");
        }
        else if(x<0&&y<0){
            System.out.println("the given quadrant lies in third quadrant");
        }
        else if(x<0&&y>0){
            System.out.println("the given coordinates lies in fourth quadrant");
        }
        else if(x==0){
            System.out.println("the given coordinates lies on x-axis");
        }
        else if(y==0){
            System.out.println("the given coordinates lies on y-axis");
        }
        else{
            System.out.println("the given coordinates lie on origin");
        }
    }
}
