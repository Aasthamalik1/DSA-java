package loops;

import java.util.Scanner;

/*print all natural number between 1 and n.print FIZZ in place of multiple of 3 and Buzz in place of multiple of 5 */
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter N");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("Fizz"+" ");
            }
            else if(i%5==0){
                System.out.print("Buzz"+" ");
            }
            else
            System.out.print(i+" ");
        }
    }
}
