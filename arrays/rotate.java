package arrays;

import java.util.Scanner;
/*Wap to rotate an array by k steps */
public class rotate {
    public static void reverse(int arr[],int start,int end){
        int i=start;
        int j=end;
        while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
            }
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
         System.out.println("enter the number of steps");
         int k=s.nextInt();
         reverse(arr,0,arr.length-1);
         reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
