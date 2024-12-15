package arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
         int n=s.nextInt();
         System.out.println("enter array elements");
         int arr[]=new int[n];
         for(int i=0;i<n;i++ ){
            arr[i]=s.nextInt();
         }
         boolean flag=false;
         int idx=-1;
         System.out.println("enter the element to be searched");
         int x=s.nextInt();
         for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                idx=i;
                flag=true;
                break;
            }
         }
         if(flag){
            System.out.println("element found at index"+idx);
         }
         else{
            System.out.println("element not found"+idx);
         }
    }
}
