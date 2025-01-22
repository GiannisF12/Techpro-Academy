import java.util.Scanner;

public class ask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        int count = 0;
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum = sum + (number % 10);
                number = number / 10;
                System.out.println("New Number: " + number);
            }
            number = sum;
            System.out.println("sum: " + sum);
            count++;
        }

        System.out.println("Final Single Digit: " + number);
        System.out.println("Number of Additions: " + count);
    }
}
