package arrays;

import java.util.Scanner;
/* wap to find doublet whoose sum is equal to target sum */
public class doublet {
    public static int doublet(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==k){
                   count++;
               }
           }
        }
        return count;
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
         System.out.println("enter target sum");
         int x=s.nextInt();
        
         System.out.println("number of doublets with the target sum is: "+doublet(arr, x));
    }
}
