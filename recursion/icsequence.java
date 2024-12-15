package recursion;

import java.util.Scanner;

// print all increasing sequence of length k from first n natural number
public class icsequence {
    public static void seq(int i,String str,String ans,int k){
          if(i==str.length()){
            if(ans.length()==k)
            System.out.println(ans);
            return;
          }
          char ch=str.charAt(i);
          seq(i+1, str, ans, k);
          if(ans.length()<k){
             ans+=ch;
          }
          seq(i+1, str, ans, k);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        String str="";
        for(int i=1;i<=n;i++){
            str+=i;
        }
        System.out.println("enter the length");
        int k=s.nextInt();
        seq(0,str,"",k);
    }
}
