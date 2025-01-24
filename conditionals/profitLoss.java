package conditionals;

import java.util.Scanner;
/* find whether the transaction is profitable,loss or neutral based on CP and SP */
public class profitLoss {
    public static void profitloss(int cp,int sp){
        if(cp>sp){
            System.out.println("loss occured "+(cp-sp));
        }
        else if(sp>cp){
            System.out.println("profit occured: "+(sp-cp));
        }
        else
        {
            System.out.println("niether profit nor loss occured");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter cost price: ");
        
    }
}
