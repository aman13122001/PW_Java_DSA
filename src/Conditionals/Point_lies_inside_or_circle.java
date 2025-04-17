package Conditionals;

import java.util.Scanner;

public class Point_lies_inside_or_circle {
    public static void main(String[] args) {
        int x = 0, y = 0, radius = 5;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y: ");
        int y1 = sc.nextInt();

        int X = x - x1;
        int Y = y - y1;
        int d = (X * X) + (Y * Y);  // This is distance squared

        if (d < (radius * radius)) {
            System.out.println("Point lies inside");
        } else if (d == (radius * radius)) {
            System.out.println("Point lies on the circle");
        } else {
            System.out.println("Point lies outside");
        }

        sc.close();
    }
}
