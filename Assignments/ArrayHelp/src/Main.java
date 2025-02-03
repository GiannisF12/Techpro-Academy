import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7};
        int [] arr1 = new int[] {5,1,3};
        int [] arr2 = new int[] {1,8};
        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.println("Shuffle Array: " + Arrays.toString(ArrayHelper.shuffle(arr)));
        System.out.println("Has Consecutive: " + ArrayHelper.hasConsecutive(arr));
        System.out.println("Shift Array: " + Arrays.toString(ArrayHelper.shift(arr)));
        System.out.println("Rotate Array: " + Arrays.toString(ArrayHelper.rotate(arr,3)));
        System.out.println("To Number Array: " + ArrayHelper.toNumber(arr));
        System.out.println("Add Arrays: " + ArrayHelper.addArrays(arr1, arr2));
    }
}