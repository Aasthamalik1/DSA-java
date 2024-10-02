package loops;
/*given a natural number n smaller than 100.we need to find all its multiples between 1 to 100
 */
import java.util.Scanner;

public class multiple {
    public static void Multiple(int n){
        for(int i=1;i<=100;i++){
            if(i%n==0){
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Multiple(n);
    }
}
