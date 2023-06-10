package EntirePascalTriangle;

import java.util.ArrayList;

public class EntirePascalTriangle {

    public static void main(String[] args) {
        System.out.println(printPascal(7));

    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> triangle = new ArrayList<>();

        for (int i = 1; i <= n; ++i) {
            triangle.add(generateRow(i));
        }
        return triangle;
    }

    public static ArrayList<Long> generateRow(int n) {
        ArrayList<Long> row = new ArrayList<>();

        long res = 1L;

        for (int i = 1; i <= n; ++i) {
            if (i == 1 || i == n) row.add(1L);

            else {
                res = res * (n - (i - 1));
                res = res / (i - 1);
                row.add(res);
            }
        }
        return row;
    }
}
