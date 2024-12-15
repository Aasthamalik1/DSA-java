package recursion;
import java.util.Scanner;
public class arraytraversal {
    public static void Print(int n, int arr[]){
             if(n<0){
                return;
             }
             Print(n-1,arr);
             System.out.print(arr[n]+" ");

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
         Print(arr.length-1, arr);
    }
}
