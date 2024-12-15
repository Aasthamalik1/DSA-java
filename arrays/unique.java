package arrays;

import java.util.Arrays;
import java.util.Scanner;

/* every number is repeated twice except one number.Find that unique number */
public class unique {
    public static void find(int arr[]){
       for(int i=0;i<arr.length;i++){
        int count=0;
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[i]==arr[j]){
                count++;
            }
       }
       if(count<1){
        System.out.println("the unique element is "+arr[i]);
        break;
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
         find(arr);
    }
}
