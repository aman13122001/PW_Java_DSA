package Conditionals;
import java.util.Scanner;

public class print_Absolute_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num<0){
            num = num*(-1);

        }
        System.out.println("The absolute Value is  : "+num);
    }
}
