static int findMinDiff(int[] arr, int m){
    Arrays.sort(arr);


    int minDiff = Integer.MAX_VALUE;


    for (int i =0; i+m -1 < arr.length; i++){
        if( arr[i+m -1] - arr[i] < minDiff)
            minDiff = arr[i+m -1] - arr[i];
    }
    return minDiff;
}
public static void main(String[] args) throws Exception {
    int[] arr = {7,3,2,4,9,12,56};
    int m =3;
    System.out.println(findMinDiff(arr, m));
}
