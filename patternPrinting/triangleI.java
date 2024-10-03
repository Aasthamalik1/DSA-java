package patternPrinting;

import java.util.Scanner;

/*
 make following patterns:
    *           1            1         A            A                *       ****        ****
    **          12           22        AB           BB              **       ***          ***
    ***         123          333       ABC          CCC            ***       **            **
    ****        1234         4444      ABCD         DDDD          ****       *              *
 
 */
public class triangleI {
    public static void StarTriangle(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print("*"+" ");
         }
         System.out.println();
      }
    }
    public static void numberTriangleI(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }
    }
 public static void numberTriangleII(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(i+" ");
         }
         System.out.println();
      }
    }
    public static void aplhaTriangleI(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print((char)('A'+j-1)+" ");
         }
         System.out.println();
      }
    }
    public static void aplhaTriangleII(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print((char)('A'+i-1)+" ");
         }
         System.out.println();
      }
    }
   public static void StarTriangleII(int n){
      for(int i=1;i<=n;i++){
         for(int k=1;k<=n-i;k++){
            System.out.print(" "+" ");
         }
         for(int j=1;j<=i;j++){
            System.out.print("*"+" ");
         }
         System.out.println();
      }
   }
    public static void StarTriangleIII(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i+1;j++){
            System.out.print("*"+" ");
         }
         System.out.println();
      }
    }

    public static void StarTriangleIV(int n){
      for(int i=1;i<=n;i++){
         for(int k=1;k<=i-1;k++){
            System.out.print(" "+" ");
         }
         for(int j=1;j<=n-i+1;j++){
            System.out.print("*"+" ");
         }
         System.out.println();
      }
    }
    
   public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      System.out.println("enter n");
      int n=s.nextInt();
      StarTriangle(n);
      numberTriangleI(n);
      numberTriangleII(n);
      aplhaTriangleI(n);
      aplhaTriangleII(n);
      System.out.println();
      StarTriangleII(n);
      System.out.println();
      StarTriangleIII(n);
      System.out.println();
      StarTriangleIV(n);
   }
}
