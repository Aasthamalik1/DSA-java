package strings;
import java.util.Arrays;
import java.util.Scanner;
/*sort the given string */
public class sorting {
    public static String sort(String str){
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        String str1=new String(arr);
        return str1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        System.out.println("string after sorting: "+sort(str));

    }
}
