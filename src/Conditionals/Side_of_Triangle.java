package Conditionals;

import java.util.Scanner;

import java.util.Scanner;

public class Side_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Side: ");
        int a = sc.nextInt();

        System.out.print("Enter second Side: ");
        int b = sc.nextInt();

        System.out.print("Enter third Side: ");
        int c = sc.nextInt();

        if (a+b>c && b+c>a && a+c>b) {
            System.out.println("It's Side of Triangle");
        }  else {
            System.out.println("It's  not Side of Triangle");
        }
    }
}
