package patternPrinting;

import java.util.Scanner;

/*
 print following square patterns:
 *****      1234      1111        ABCD      AAAA
 *****      1234      2222        ABCD      BBBB
 *****      1234      3333        ABCD      CCCC
 *****      1234      4444        ABCD      DDDD
 */
public class SquarePatterns {
    public static void StarSquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void numberSquareI(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void numberSquareII(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void alphaSquareI(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
    public static void alphaSquareII(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+i-1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        StarSquare(n);
        numberSquareI(n);
        numberSquareII(n);
        alphaSquareI(n);
        alphaSquareII(n);
    }
}
