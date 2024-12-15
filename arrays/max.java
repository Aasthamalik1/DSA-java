package arrays;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
         int n=s.nextInt();
         System.out.println("enter array elements");
         int arr[]=new int[n];
         for(int i=0;i<n;i++ ){
            arr[i]=s.nextInt();
         }
         int max=Integer.MIN_VALUE;
         for(int ele:arr){
            max=Math.max(max, ele);
         }
         System.out.println("maximum element in array is: "+max);
    }
}
