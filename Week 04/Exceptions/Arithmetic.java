import java.lang.reflect.InvocationTargetException;

public class Arithmetic {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        double z = 0;

        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.err.println(e);
        } finally {
            System.out.println("this gets called in any case");
        }

        try {
            Arithmetic.class.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException |
                 InvocationTargetException | SecurityException e) {
            e.printStackTrace();
        }
        checkVowels("sdf");
    }

    public static void checkVowels (String text) {
        boolean containsVowels = false;
        String vowels = "aeiouyAEIOUY";
        if (text == null) {
            throw new NullPointerException("String is null");
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                containsVowels = true;
                break;
            }
        }

        if (!containsVowels) {
            throw new NoVowelsExcpetion("String does not contain any vowels");
        }
    }
}