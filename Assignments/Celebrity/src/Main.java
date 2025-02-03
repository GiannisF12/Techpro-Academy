import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix ={{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(Arrays.deepToString(matrix));
        int i = 0;
        int n = 3;
        int k = 0;
        for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
                System.out.print(matrix[k][j]+" ");
            k++;
        }
        System.out.println();
        for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
            for(int c = j; c < 3; c++){
                System.out.print(matrix[c][j]+" ");
            }
        }
    }
}