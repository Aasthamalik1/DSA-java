package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*find all the duplicate element in the array */
public class duplicate {
    public static void Duplicate(int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer>temp=new ArrayList<>();
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                if(!temp.contains(arr[i])){
                    temp.add(arr[i]);
                }
            }
            i++;
        }
        for(int ele:temp){
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
         System.out.println("duplicates elements are: ");
         Duplicate(arr);
    }
}
