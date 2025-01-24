package conditionals;

import java.util.Scanner;
//determine whether the given alphabet is vowel or consonant
public class vowels {
    public static void alphaType(char ch){
        switch (ch) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;    
            default:
             System.out.println("consonant");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter alphabet");
        char ch=s.nextLine().charAt(0);
        alphaType(ch);
    }
}
