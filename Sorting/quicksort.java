package Sorting;

import java.util.Scanner;

public class quicksort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int Partition(int arr[],int lo,int high){
        int idx=(lo+high)/2;
        int pivot=arr[idx];
        int c=0;
        for(int i=lo;i<=high;i++){
            if(i==idx) continue;
            if(arr[i]<=pivot){
                c++;
            }
        }
        
        int cIdx=lo+c;
        swap(arr,idx,cIdx);
        int i=lo;
        int j=high;
        while(i<cIdx&&j>cIdx){
            if(arr[i]<pivot){
                i++;
            }
            else if(arr[j]>pivot){
                j--;
            }
            else if(arr[i]>pivot&&arr[j]<pivot){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return cIdx;
    }
    public static void QuickSort(int arr[],int lo,int hi){
        if(lo>=hi){
            return;
        }
        int idx=Partition(arr, lo, hi);
        QuickSort(arr, lo, idx-1);
        QuickSort(arr, idx+1, hi);
    }
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
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
         print(arr);
         QuickSort(arr, 0, n-1);
         print(arr);
    }
}
