package BasicOfJAva;

import java.util.Scanner;

public class Find_Remainder_Using_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        int Q = a/b;

        int rm = a-(b*Q);
        System.out.println("Remainder of "+a+"and " +b+ " = "+rm);

        int rem = a%b;
        System.out.println("Remainder = "+rem);



    }
}
