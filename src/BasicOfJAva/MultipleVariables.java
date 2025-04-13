package BasicOfJAva;

public class MultipleVariables {
    public static void main(String[] args) {
        int x=5,y=8,z=9;
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
        z=10;
        System.out.println("The value of z is "+z);
        System.out.println(x+y+z);
//      1.print as character/text.
        System.out.println("The value "+x+y+z);
//        output:-5810
//      2.print as character/text.
        System.out.println(x+""+y+z);
//        output:-5810
//      3.print as a number before "" and after as a character/text.
        System.out.println(x+y+""+z);
        System.out.println(x+y+z+"Sum");
//      Add to words using "+" plus.
        System.out.println("Hello Aman"+"Good Morning");

    }
}
