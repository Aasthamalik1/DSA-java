package arrays;
/*return the difference of sum of elements at even and odd places */
import java.util.Scanner;

public class evenOdd {
    public static int sum(int arr[]){
        int s1=0;
        int s2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                s1=s1+arr[i];
            }
            else{
                s2=s2+arr[i];
            }
        }
        return Math.abs(s1-s2);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
         int n=s.nextInt();
         System.out.println("enter array elements");
         int arr[]=new int[n];
         for(int i=0;i<n;i++ ){
            arr[i]=s.nextInt();
         }
         System.out.println("the difference between the sum of elements at even and odd place is: "+sum(arr));
    }
}
