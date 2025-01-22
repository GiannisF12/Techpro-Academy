public class px2 {
    public static void main(String[] args) {
        printNum(10);
    }


    static void printNum (int number) {  
        if (number == 1) {
            System.err.println(number + " ");
        }
        else {
            printNum(number - 1);
            System.out.println(number + " ");
        }
    }
}