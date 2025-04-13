package BasicOfJAva;
import java.util.Scanner;
public class AreaCircleWith_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Redius:");
      int radius = sc.nextInt();
      double pi = 3.1415;
      double area = pi*radius*radius;
        System.out.println("The Area of circle is : "+area);


    }
}
