import java.lang.Math;
public class flow1 {
    public static void main(String[] args) {

        int number = 153;
        int digits=0;
        int temp = number;
        int temp2 = number;
        while (number !=0 ) {
            digits++;
            number = number / 10;
            System.out.println("count:"+digits);
        }

        //digits = (int) Math.log10(number) +1; den prepei na einai 0 alla pio aplo.

        int sum = 0;
        while (temp > 0) {
            sum += (int) Math.pow(temp % 10, digits);
            temp /=10;
        }

        if(sum == temp2) System.err.println("Armostrong");
        else System.out.println("not armstrong");

        // for(int i = 1; i<=digits; i++) {
        //     System.out.println("i:"+i);
        //     temp = temp % 10;
        //     System.out.println("number2:"+temp);
        // }

    }
}