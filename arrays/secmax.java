package arrays;

import java.util.Scanner;
/*Wap to find second largest element in array */
public class secmax {
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
         int secmax=Integer.MIN_VALUE;
         for(int ele:arr){
            max=Math.max(max,ele);
         }
         for(int ele:arr){
            if(ele!=max){
                secmax=Math.max(ele,secmax);
            }
         }
         System.out.println("second largest element in the array is: "+secmax);
    }
}
