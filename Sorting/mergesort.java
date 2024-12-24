package Sorting;

import java.util.Scanner;

/*implement merge sort algorithm on array */
public class mergesort {
    public static void merge(int a[],int b[],int c[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int arr[]){
        if(arr.length==1){
            return;
        }
        int n=arr.length;
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
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
         mergeSort(arr);
         print(arr);
}
}

