package Conditionals;

import java.util.Scanner;

public class Number_Divisible_by_5or3_but_not_15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
//        if(num%5==0 || num%3==0){
//            if(num%15!=0){
//                System.out.println(num+" is Divisible by either  5 or 3 but not 15");
//
//            }else {
//                System.out.println("Not matching the required condition");
//            }
//
//        }
//        else {
//            System.out.println("Not matching the required condition");
//        }
        if(num%15!=0 && (num%5==0 || num%3==0)){
            System.out.println(num+" is Divisible by either  5 or 3 but not 15");
        }
        else {
            System.out.println("Not matching the required condition");
        }


    }
}
