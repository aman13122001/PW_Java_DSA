package BasicOfJAva;
import java.util.Scanner;

public class SumOfTwoNumberUsing_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();

        int Sum = num1+num2;

        System.out.println("the Sum of "+num1+" and "+num2+" = "+Sum);

    }
}
