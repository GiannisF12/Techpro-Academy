import java.lang.Math;
public class px1 {
    public static void main(String[] args) {
        //String s = "c";
        System.out.println(findDigits(123));
        System.out.println(factorial(1));

    }

    static int findDigits (int number) {
        if (number != 0) {
            return (int) Math.log10(number) + 1;
        }
        else {
            return 1;
        }
    }

    static void findDigits (double number) {  
        System.out.println("cant compute for double");
    }

    static void show(String s) {
        System.err.println(s);
    }

    static int factorial (int number) {  
        if (number == 1) {
            return 1;
        }
        else {
            return number * factorial(number - 1);
        }
    }
}