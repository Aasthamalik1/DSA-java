package arrays;

import java.util.Scanner;

/*sort 0,1,2 */
public class SortColors {
    public static void methodI(int arr[]){
        int z=0;
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                z++;
            }
            else if(arr[i]==1){
                o++;
            }
        }
        for(int i=0;i<z;i++){
            arr[i]=0;
        }
        for(int i=z;i<z+o;i++){
            arr[i]=1;
        }
        for(int i=z+o;i<arr.length;i++){
            arr[i]=2;
        }
    }
    public static void methodII(int arr[]){
        int lo=0;
        int mid=0;
        int hi=arr.length-1;
        while(mid<=hi){
           if(arr[mid]==0){
            int temp=arr[lo];
            arr[lo]=arr[mid];
            arr[mid]=temp;
            lo++;
            mid++;
           }
           else if(arr[mid]==1){
            mid++;
           }
           else{
            int temp=arr[mid];
            arr[mid]=arr[hi];
            arr[hi]=temp;
            mid++;
            hi--;
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
        /*  methodI(arr);
         System.out.println("color sorting through methodI");
         for(int ele:arr){
            System.out.print(ele+" ");
         }
            */
            methodII(arr);
         System.out.println("color sorting through methodII");
         for(int ele:arr){
            System.out.print(ele+" ");
         }
    }
}
