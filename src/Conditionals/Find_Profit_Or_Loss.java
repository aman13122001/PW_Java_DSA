package Conditionals;
import java.util.Scanner;

public class Find_Profit_Or_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        int cost = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sell = sc.nextInt();

        if (cost<sell){
            int profit = sell-cost;
            System.out.println("Your Profit is  = " +profit);
        }
        else {
            int loss = cost-sell;
            System.out.println("Your Loss is = "+loss);
        }
    }
}
