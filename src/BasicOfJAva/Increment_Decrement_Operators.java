package BasicOfJAva;

public class Increment_Decrement_Operators {
    public static void main(String[] args) {
        int x=5;
        x++;//x=x+1;
        System.out.println(x);
        x--;//x=x-1;
        System.out.println(x);
        ++x;//x=x+1
        System.out.println(x);
        --x;//x=x-1;
        System.out.println(x);

        int y=5;
//        x++ is "use x and then increment".
        System.out.println(y++);//output:-5
        System.out.println(y);//output:-6

        int z=6;
//        ++x is "increment x and then use"
        System.out.println(++z);
        System.out.println(z);
        int p=2;
//        p-- is " use x and then Decrement "
        System.out.println(p--);//output:2
        System.out.println(p);//output:1

        int c=7;
//        --c is "Decrement  x and then use"
        System.out.println(--z); //output:6
        System.out.println(z); //output:6

    }
}
