package Conditionals;

import java.util.Scanner;

public class Three_point_on_line {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("enter y2: ");
        int y2 = sc.nextInt();
        System.out.print("enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("enter y3: ");
        int y3 = sc.nextInt();

        double m1= (double)(y2-y1)/(x2-x1);
        double m2=(double)(y3-y2)/(x3-x2);


        if(m1==m2){

            System.out.println("The three point lie on a single line ");
        }else{
            System.out.println("they do not lie on a single line");
        }

    }
}
