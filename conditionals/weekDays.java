package conditionals;

import java.util.Scanner;
/*given the number of day.Find corresponding week on that day of week.Use switch case */
public class weekDays {
    public static void PrintWeekDays(int day){
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
            System.out.println("Tuesday");    
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
           System.out.println("Thursday");
           break;
           case 5:
           System.out.println("friday");
           break;
           case 6:
           System.out.println("saturday");
           break;
           case 7:
           System.out.println("sunday");
            default:
            System.out.println("invalid input day");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter day number");
        int n=s.nextInt();
        PrintWeekDays(n);
    }
}
