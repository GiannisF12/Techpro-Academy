import java.util.Scanner;

public class ask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt(); 
        scanner.close();

        //Upper Part

        for (int i = 1; i < number; i++) {
            //print spaces
            for (int j = i; j < number; j++) {
                System.out.print("");
            }
            //Print descenting numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //print ascenting numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            //next line
            System.out.println();

        }

        //lower part

        for (int i = number -1; i >= 1; i--) {
            //print spaces
            for (int j = number; j > i; j--) {
                System.out.print("");
            }
            //Print descenting numbers
            for (int j = i; j >= i; j--) {
                System.out.print(j);
            }
            //print ascenting numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            //next line
            System.out.println();

        }
       
    }
}
