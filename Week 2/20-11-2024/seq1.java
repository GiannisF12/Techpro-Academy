public class seq1 {
    public static void main(String[] args) {
        System.out.println(sequence(3));
    }


    static int sequence (int number) {  
        if (number == 1 || number == 0) {
            return number;
        }
        return sequence(number - 1) + sequence(number - 2);
    }
}
