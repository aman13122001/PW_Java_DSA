package Conditionals;

import java.util.Scanner;

public class leap_Year_orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int year = sc.nextInt();

        if(year%4==0 && year%100==0 ||year%400==0){
            System.out.println(year+" is Leap year .");
        }
        else {
            System.out.println(year+" is not Leap year .");
        }
    }



}
