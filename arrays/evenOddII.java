package arrays;

import java.util.Scanner;
/*multiply the elements at odd index by 2 and add 10 to elements at even places */
public class evenOddII {
    public static void modify(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
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
         System.out.println("array after modification is:");
         modify(arr);
         for(int ele:arr){
            System.out.print(ele+" ");
         }
    }
}
