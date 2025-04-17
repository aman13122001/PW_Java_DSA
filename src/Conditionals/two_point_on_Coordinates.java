package Conditionals;

import java.util.Scanner;

public class two_point_on_Coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
        System.out.print("enter y: ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("the point is origin.");
        } else if (x==0) {
            System.out.println("the point lie on y-axis");

        }else if (y==0){
            System.out.println("the point lie on x-axis");
        }
        else {
            System.out.println("nether from x-axis and y-axis" );
        }
    }
}
