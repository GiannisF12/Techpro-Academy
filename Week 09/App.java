import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Pair<Integer> pair = new Pair<>(3,5);
        System.out.println(pair);

        Pair<String> temp = new Pair<String>("test", "string");
        System.out.println(temp);

        Tuple<Integer, String> tuple = new Tuple<Integer,String>(3, "Hello");
        System.out.println(tuple);

        Tuple<Integer, List<String>> tuple1 = 
            new Tuple<Integer, List<String>>(1, Arrays.asList("a","b"));
            System.out.println(tuple1);

    }
}
