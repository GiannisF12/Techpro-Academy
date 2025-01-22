import java.util.Scanner;

public class ask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        scanner.close();

        int count = 0;  

        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                if (i + j == number) {
                    count++;
                    System.out.println("Combination (" + i + ", " + j + ")");
                }
            }
        }

        System.out.println("Unique Combinations: " + count);
    }
}
