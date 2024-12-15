package binarysearch;

import java.util.Scanner;

public class search {
    public static void BinarySearch(int arr[],int target){
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
             System.out.println("target found at index"+mid);
            break;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;;
            }
            else{
                System.out.println("element not found"+"-1");
            }
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
         System.out.println("enter target");
         int x=s.nextInt();
         BinarySearch(arr, x);
    }
}
