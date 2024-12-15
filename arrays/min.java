package arrays;

import java.util.Scanner;

public class min {
    public static int Min(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int ele:arr){
            min=Math.min(min,ele);
        }
        return min;
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
         System.out.println("minimum element in the array: "+Min(arr) );
    }
}
