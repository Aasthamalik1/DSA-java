package prefixsum;

import java.util.Scanner;

public class pivot {
    public static int find(int arr[]){
        /*this is a brute force approach tc=O(n*n) */
        for(int i=0;i<arr.length;i++){
            int ls=0;
            int rs=0;
            for(int j=0;j<i;j++){
                   ls+=arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                     rs+=arr[j];
            }
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
    public static int Find(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        int temp=arr[arr.length-1];
        if(temp-arr[0]==0){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            if(temp-arr[i-1]==arr[i]){
                return i;
            }
        }
        return -1;
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
         System.out.println("the pivot element is at: "+find(arr));

    }
}
