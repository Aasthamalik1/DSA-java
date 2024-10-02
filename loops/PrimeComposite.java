package loops;
import java.util.Scanner;
/*check weather the given number is prime or composite */
public class PrimeComposite {
    public static boolean Check(int n){
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=s.nextInt();
        if(Check(n)){
            System.out.println("composite number");
        }
        else{
            System.out.println("prime number");
        }
    }
}
