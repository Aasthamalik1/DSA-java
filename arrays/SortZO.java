package arrays;

import java.util.Scanner;

public class SortZO {
    public static void methodI(int arr[]){
        int z=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
              z++;
            }
        }
        for(int i=0;i<z;i++){
            arr[i]=0;
        }
        for(int j=z;j<arr.length;j++){
           arr[j]=1;
        }
    }
    public static void methodII(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
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
         System.out.println("array sorted through methodI ");
         methodI(arr);
         for(int ele:arr){
            System.out.print(ele+" ");
         }
         System.out.println("array sorted through methodII");
         for(int ele:arr){
            System.out.print(ele+" ");
         }

   }
}
