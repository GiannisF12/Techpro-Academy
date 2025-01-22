import java.util.Arrays;

public class ArrayHelper {
    public static int[] shuffle(int [] arr) {
        int[] NewArray = Arrays.copyOf(arr, arr.length);
        for (int i = NewArray.length - 1; i > 0; i--) {
            int j = (int)(Math.random()* (i+1));
            int temp = NewArray[i];
            NewArray[i] = NewArray[j];
            NewArray[j] = temp;
        }
        return NewArray;
    }

    public static boolean hasConsecutive(int [] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static int [] shift(int [] arr) {
        int[] NewArray = Arrays.copyOf(arr, arr.length);
        int last = NewArray[NewArray.length - 1];
        for(int i = NewArray.length - 1; i > 0; i--) {
            NewArray[i] = NewArray[i - 1];
        }
        NewArray [0] = last;
        return NewArray;
    }

    public static int[] rotate(int[] arr, int n) {

        int[] NewArray = Arrays.copyOf(arr, arr.length);

        System.arraycopy(arr, n, NewArray, 0, arr.length - n);

        System.arraycopy(arr, 0, NewArray, arr.length - n, n);

        return NewArray;
    }

    public static int toNumber(int [] arr) {
        int[] NewArray = Arrays.copyOf(arr, arr.length);
        StringBuilder result = new StringBuilder();
        for (int i : NewArray) {
            result.append(i);
        }
        return Integer.parseInt(result.toString());
    }

    public static int addArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] sum = new int[maxLength];
        int value1,value2;

        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                value1 = arr1[i];
            } else {
                value1 = 0;
            }
            if (i < arr2.length) {
                value2 = arr2[i];
            } else {
                value2 = 0;
            }

            sum[i] = value1 + value2;
        }

        StringBuilder result = new StringBuilder();
        for (int i : sum) {
            result.append(i);
        }

        return Integer.parseInt(result.toString());
    }
}
