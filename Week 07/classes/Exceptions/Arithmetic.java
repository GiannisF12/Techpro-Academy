package Exceptions;
import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
public class Arithmetic {
    public static void main(String[] args) {
        int x = 3;
        int y =2;
        double z = 0;
        try {
            checkVowels("sadfr");
        } catch (NoVowelsException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            z=x/y;
        } catch (ArithmeticException e) {
           System.err.println(e);
        } finally {
            System.out.println("This gets called in any case");
        }

        try {
            Arithmetic.class.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException | IllegalAccessException 
        | IllegalArgumentException |InvocationTargetException e) {
            e.printStackTrace();
        }
        
        try {
            checkVowels("sadfr");
        } catch (NoVowelsException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }

    public static void checkVowels(String text) throws NoVowelsException {
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";
    
        for (int i = 0; i < text.length(); i++) {
          char ch = text.charAt(i);
          if (vowels.contains(String.valueOf(ch))) {
            containsVowels = true;
            break;
          }
        }
        if (!containsVowels) {
          throw new NoVowelsException("String does not contain any vowels.");
        }
      }
    }

    class NoVowelsException extends Exception {
        public NoVowelsException(String message) {
          super(message);
        }
}
