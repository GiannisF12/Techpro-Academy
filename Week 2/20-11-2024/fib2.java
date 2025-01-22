public class fib2 {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    static long fib (int number) {  //long gia na blepei to 7
        if (number == 0) {
            return 1;
        }
        else if (number == 1) {
            return 2;
        }
        return (long)Math.pow(fib(number - 1), 2) + (long)Math.pow(fib(number - 2), 2);
    }
}
