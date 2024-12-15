package arrays;

import java.util.Scanner;

/*find the number of elements greater than x */
public class greaterX {
    public static int Count(int arr[],int x){
        int c=0;
               for(int ele:arr){
                if(ele>x){
                    c++;
                }
               }
               return c;
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
         System.out.println("enter x:");
         int x=s.nextInt();
         System.out.println("the elements greater than x are: "+Count(arr, x));
    }
}
