package Conditionals;
import java.util.Scanner;

public class check_three_Digit_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num>99 && num<1000){
            System.out.println(num +" is Three Digit number");
        }else {
            System.out.println(num +" is not Three Digit number");
        }
    }
}
