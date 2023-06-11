package SortZeroOneTwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortZeroOneTwoBetter {

    public static void main(String[] args) {

        int[] a1 = {0, 1, 2, 2, 1, 0};
        int[] a2 = {0, 1, 2, 1, 2, 1, 2};
        int[] a3 = {0, 1, 1, 0, 0, 1, 1, 0, 1, 0};
        int[] a4 = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0};
        int[] a5 = {1, 1, 2, 1, 1, 2, 1, 1, 1, 1};
        int[] a6 = {2, 2, 1, 1, 2, 2, 2, 2, 2, 2};
        int[] a7 = {1, 2, 2, 1, 1, 2, 2, 1, 1, 2};
        int[] a8 = {2, 2, 1, 1, 2, 0, 2, 0, 2, 1};

        sort012(a5);

        System.out.println(Arrays.toString(a5));

    }

    public static void sort012(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i : arr) {
            if (i == 0) ++c0;
            else if (i == 1) ++c1;
            else if (i == 2) ++c2;
        }

        for (int i = 0; i < c0; ++i)
            arr[i] = 0;

        for (int i = c0; i < c0+c1; ++i)
            arr[i] = 1;

        for (int i = c0+c1; i < c0+c1+c2; ++i)
            arr[i] = 2;
    }
}
