package BasicOfJAva;

import java.util.Scanner;

public class SquareOf_number_Using_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        int Square = num*num;

        System.out.println("Square of "+num+" is  :"+Square);

    }

}
