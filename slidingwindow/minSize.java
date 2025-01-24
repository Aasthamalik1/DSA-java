package slidingwindow;

import java.util.Scanner;

/* Given an array and target.Find the minimum length of subarray whoose sum is equal to target */
public class minSize {
    /*brute force approach */
    public static int find(int arr[],int target){
        int count=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==target){
                    count=Math.min(count,j-i+1);
                    break;
                }
                if(sum>target){
                    break;
                }
            }
        }
        return count;
    }
    /*sliding window approach */
    public static int Find(int arr[],int target){
        int i=0;
        int j=0;
        int sum=0;
        int count=Integer.MAX_VALUE;
        while(j<arr.length &&sum < target){
            sum=sum+arr[j];
            j++;
        }
        j--;
        while(i<arr.length && j<arr.length){
                if(sum>=target){
                    count=Math.min(j-i+1, count);
                }
                sum=sum-arr[i];
              i++;
              j++;
              while(j<arr.length && sum < target){
                sum=sum+arr[j];
                j++;
            }
            j--;
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
         System.out.println("enter target");
         int target=s.nextInt();
         System.out.println(Find(arr, target));
    }
}
