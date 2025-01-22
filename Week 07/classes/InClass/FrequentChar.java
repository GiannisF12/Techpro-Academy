package InClass;

import java.util.Arrays;

public class FrequentChar {
    public static void main(String[] args) {
        String str="TrueeFalseeaaaa";
        System.out.println("Most frequent char is: "+maxOccurringChar(str));
    }

    static char maxOccurringChar(String str) {
        char ans = 'a';
        int maxfreq = 0;
        int[] count = new int[256];
        for (int i=0; i<str.length();i++){
            count[str.charAt(i)]++;
            if(count[str.charAt(i)] > maxfreq){
                maxfreq = count[str.charAt(i)];
                ans = str.charAt(i);
            }
        }
        return ans;
     }

     static int frequentNum(int arr[]){
        Arrays.sort(arr);

        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for(int i= 1; i <arr.length;i++){
            if(arr[i] == arr[i-1]){
                curr_count++;
            } else 
                curr_count = 1;

            if (curr_count >max_count){
                max_count = curr_count;
                res = arr[i-1];
            }
        }
        return res;
     }
}
