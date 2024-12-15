package arrays;

import java.util.Scanner;

public class triplet {
    public static int count(int arr[],int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length-2;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        c++;
                    }
                }
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
         System.out.println("enter target sum");
         int x=s.nextInt();
         System.out.println("number of such triplets is: "+count(arr, x));
    }
}
