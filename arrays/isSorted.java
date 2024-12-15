package arrays;

import java.util.Scanner;

public class isSorted {
    public static boolean sorted(int arr[]){
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                flag =false;
            }
        }
        return flag;
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
         if(sorted(arr)){
             System.out.println("given array is sorted");
         }
         else{
            System.out.println("given array is unsorted");
         }
    }
}
