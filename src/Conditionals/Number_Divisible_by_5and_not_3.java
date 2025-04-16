package Conditionals;

import java.util.Scanner;

public class Number_Divisible_by_5and_not_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%5==0 && num%3!=0){
            System.out.println(num+" is Divisible by 5 and not by 3");
        }
        else if(num%5==0 && num%3==0){
            System.out.println(num+" is Divisible by 5 and  3");
        }
        else {
            System.out.println(num+" is not Divisible by 5 and 3");
        }
    }
}
