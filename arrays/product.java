package arrays;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
         int n=s.nextInt();
         System.out.println("enter array elements");
         int arr[]=new int[n];
         for(int i=0;i<n;i++ ){
            arr[i]=s.nextInt();
         }
         int pro=1;
         for(int i=0;i<arr.length;i++){
            pro=pro*arr[i];
         }
         System.out.println("product of all elements is "+pro);
    }
}
