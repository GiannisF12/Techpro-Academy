import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String t = "anagram";
        String s = "nagaram";
        if(isAnagram(s, t)){
            System.out.println("Is Anagram");
        } else {
            System.out.println("Is not anagram");
        }
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
      char[] sChars = s.toCharArray();
      char[] tChars = t.toCharArray();
      Arrays.sort(sChars);  
      Arrays.sort(tChars);
      return Arrays.equals(sChars, tChars);
}


}

