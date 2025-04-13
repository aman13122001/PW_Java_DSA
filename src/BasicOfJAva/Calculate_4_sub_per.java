package BasicOfJAva;

import java.util.Scanner;

public class Calculate_4_sub_per {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks:");
        double sub1 =sc.nextInt();
        double sub2 =sc.nextInt();
        double sub3 =sc.nextInt();
        double sub4 =sc.nextInt();
        double total =((sub1+sub2+sub3+sub4)/240)*100;
        System.out.println("percentage of 4 Subjects:"+total);
    }
}
