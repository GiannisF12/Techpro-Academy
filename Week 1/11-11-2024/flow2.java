import java.lang.Math;
public class flow2 {
    public static void main(String[] args) {

        int number = 9;
        int square = (int) Math.pow(number,2);
        int digits = (int) Math.log10(number) + 1;
        int square_digits = (int) Math.log10(square) + 1;
        System.out.println("digits:" + digits);
        System.out.println("square:" + square);
        System.out.println("square_digits:" + square_digits);

        //int temp2 = number;
        // while (number !=0 ) {
        //     digits++;
        //     number = number / 10;
        //     System.out.println("count:"+digits);
        // }

        int divisor = (int) Math.pow(10, digits); 
        System.out.println("divisor:" + divisor);

        int rightPart = square % divisor;
        System.out.println("right:" + rightPart);

        int leftPart = square / divisor;


        if (leftPart + rightPart == number) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }


    }
}