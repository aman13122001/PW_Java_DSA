package Conditionals;

import java.util.Scanner;

public class Area_And_Perimeter_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        int area = length*breadth;
        System.out.println("Area of Rectangle: "+area);
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of Rectangle: "+perimeter);

        if(area>perimeter){
            System.out.println("The area of the rectangle is greater then Perimeter . ");
        }
        else {
            System.out.println("The area of the rectangle is less then Perimeter . ");
        }

    }
}
