package Conditionals;
import java.util.Scanner;
public class Print_the_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage : ");
        int per = sc.nextInt();
        if(per>90){
            System.out.println("Excellent");
        } else if (per>80) {
            System.out.println("Very Good");
        } else if (per>70) {
            System.out.println("Good");

        } else if (per>60) {
            System.out.println("Can do better");

        } else if (per>50) {
            System.out.println("Average Marks");

        } else if (per>40) {
            System.out.println("Below Average");

        }else {
            System.out.println("fail");
        }
    }
}
