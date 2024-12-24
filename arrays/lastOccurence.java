package arrays;

import java.util.Scanner;
/* find last occurence of target element */
public class lastOccurence {
    public static int Find(int arr[],int target){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
             if(arr[i]==target){
                ans=Math.max(ans,i);
             }
        }
        return ans;
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
         System.out.println("the last occurence of element is: "+Find(arr, x));
    }
}
