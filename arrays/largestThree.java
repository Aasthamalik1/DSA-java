package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class largestThree {
    public static void large(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("largest three elements are:");
        System.out.print(arr[n-1]+" "+arr[n-2]+" "+arr[n-3]);
        

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
         System.out.println("largest three elements in the array is :");
         large(arr);
    }
}
