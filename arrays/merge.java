package arrays;

import java.util.Scanner;

/* merge two sorted array */
public class merge {
    public static void Merge(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int c[]=new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
              c[k]=arr1[i];
              k++;
              i++;
            }
            else{
                 c[k]=arr2[j];
                 k++;
                 j++;
            }
        }
        if(i<arr1.length){
            while(i<arr1.length){
                c[k]=arr1[i];
                i++;
                k++;
            }
        }
        if(j<arr2.length){
            while(j<arr2.length){
                c[k]=arr2[j];
                j++;
                k++;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter array1 size");
         int n=s.nextInt();
         System.out.println("enter array1 elements");
         int arr1[]=new int[n];
         for(int i=0;i<n;i++ ){
            arr1[i]=s.nextInt();
         }
         System.out.println("enter array2 size");
         int m=s.nextInt();
         int arr2[]=new int[m];
         System.out.println("enter array2 elements");
         for(int i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
         }
         System.out.println("merged array:");
         Merge(arr1, arr2);
    }
}
