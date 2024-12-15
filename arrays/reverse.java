package arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
         int n=s.nextInt();
         System.out.println("enter array elements");
         int arr[]=new int[n];
         for(int i=0;i<n;i++ ){
            arr[i]=s.nextInt();
         }
         int i=0;
         int j=arr.length-1;
         while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
             }
             for(int ele:arr){
                System.out.print(ele+" ");
             }
    }
}
