package Conditionals;

import java.util.Scanner;

public class greatest_of_three_No_using_Nested_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the greatest.");
            } else {
                System.out.println(c + " is the greatest.");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is the largest");
            } else {
                System.out.println(c + " is the greatest.");
            }
        }
    }
}
