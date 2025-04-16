package Conditionals;

import java.util.Scanner;

public class Number_Divisible_by_5and_3_usingNested {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num%5==0 ) {
            if(num%3==0){
                System.out.println("the number is divisible by 5 and 3");
            }else {
                System.out.println("not divisible by 5 and 3");
            }
        }else {
            System.out.println("not divisible by 5 and 3");
        }
    }
}
