import java.util.Scanner;

public class ask2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt(); //1523
        scanner.close();
        int digits = (int) Math.log10(number) + 1; //4
        int last_digit = number % 10; //3
        int power = (int) Math.pow(10, digits - 1); //1000
        int first_digit = number / power; //1
        int swapped = last_digit * power; //3000
        swapped = swapped + number % power; //3000+523 = 3523
        swapped = swapped - last_digit; //3520
        swapped = swapped + first_digit; //3521
        System.out.println(swapped);


    }
}
