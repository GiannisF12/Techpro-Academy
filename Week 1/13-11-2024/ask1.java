import java.util.Scanner;

public class ask1 {  
    public static void main(String args[]){  
        //System.out.println("");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int max = number % 10;
        int min = number % 10;
        number /=10; // -1 epanalipsi
        
        while (number > 0) {
            int temp = number % 10;
            number /= 10;
            max = temp > max ? temp : max;
            min = temp < min ? temp : min;
        }
        System.out.println("max is "+ max + " min is " +min);
    }  
}  