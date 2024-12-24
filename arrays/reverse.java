package arrays;

import java.util.Scanner;
public class reverse {
   /* method which reverse array using extra array */
   public static void Reverse(int arr[]){
      int ans[]=new int[arr.length];
      int k=0;
      for(int i=arr.length-1;i>=0;i--){
         ans[k]=arr[i];
         k++;
      }
      for(int ele:ans){
         System.out.print(ele+" ");
      }
   }
   /*reverse an array without using an extra array */
   public static void ReverseI(int arr[]){
      int i=0;
      int j=arr.length-1;
      while(i<j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
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
        Reverse(arr);
        System.out.println();
        ReverseI(arr);
             for(int ele:arr){
                System.out.print(ele+" ");
             }
    }
}
