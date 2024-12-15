package strings;

import java.util.Scanner;

/*take a string from user and update all the cahracter at eveen position with * */
public class update {
    public static void Update(StringBuilder sb){
              for(int i=0;i<sb.length();i++){
                if(i%2==0){
                    sb.setCharAt(i, '*');
                }
              }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        StringBuilder sb=new StringBuilder(s.nextLine());
        Update(sb);
        System.out.println(sb);
    }
}
