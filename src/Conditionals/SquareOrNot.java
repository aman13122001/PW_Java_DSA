package Conditionals;
import java.util.Scanner;
public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        if(length==breadth){
            System.out.println("Yes it is Square .");
        }
        else {
            System.out.println("No it is Square .");
        }
    }
}
