import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {

            System.out.print("Enter integer (greater than 1) : ");
            number = scanner.nextInt();
            if (number <= 1) System.out.println("False Number");

        } while (number <= 1);
        scanner.close();

        int divisor = 2;
        while (number > 1) {
            while (number % divisor == 0) {
                number = number / divisor;
                System.out.print("Number: " + number +" | ");
                System.out.println("Divisor: " + divisor);
            }
            divisor++;
        }

    }
}
