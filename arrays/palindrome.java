package arrays;

import java.util.Scanner;

public class palindrome {
    public static boolean IsPalindrome(int arr[]){
        boolean flag=true;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                flag=false;
            }
            i++;
            j--;
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
         if(IsPalindrome(arr)){
            System.out.println("given array is palindrome");
         }
         else{
            System.out.println("given array is not a palindrome");
         }
    }
}
