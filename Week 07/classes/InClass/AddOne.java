package InClass;

import java.util.Arrays;

public class AddOne {
    public static void main(String[] args){
        int[] digits = {1,9,9,9};
        System.out.println();
        System.out.println(Arrays.toString(digits));
        digits=plusOne(digits);
        System.out.println(Arrays.toString(digits));
       
    } 

    public static int[] plusOne(int[] digits) { // 599
        for(int i = digits.length -1; i>=0; i--){
            if(digits[i] <9) {
                digits[i]++;
                return digits; // 600
            }
            digits[i] = 0; //1. 590 2. 500
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

}
