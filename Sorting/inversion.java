package Sorting;

import java.util.Scanner;

/*find number of inversion pairs in array.A pair is said to be inversion pair if {i<j and a[i]>a[j]} */
public class inversion {
    static int count=0;
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
                count=count+a.length-i;
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
         System.out.println();
         System.out.println("count of inversion is:"+count);
}
}
