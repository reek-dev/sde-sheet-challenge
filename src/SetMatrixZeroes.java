import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

        int[][] arr = {
                {0,1,7,8},
                {7,8,1,2},
                {9,0,1,2}
        };

        setZeros(arr);

        System.out.println(Arrays.deepToString(arr));


    }

    public static void setZeros(int arr[][]) {
        boolean[] col = new boolean[arr[0].length];
        boolean[] row = new boolean[arr.length];

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }

        }

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                if (row[i] || col[j]) arr[i][j] = 0;
            }
        }
    }


}
