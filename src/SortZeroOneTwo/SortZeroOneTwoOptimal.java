package SortZeroOneTwo;

import java.util.Arrays;

public class SortZeroOneTwoOptimal {

    public static void main(String[] args) {

        int[] a1 = {0, 1, 2, 2, 1, 0};
        int[] a2 = {0, 1, 2, 1, 2, 1, 2};
        int[] a3 = {0, 1, 1, 0, 0, 1, 1, 0, 1, 0};
        int[] a4 = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0};
        int[] a5 = {1, 1, 2, 1, 1, 2, 1, 1, 1, 1};
        int[] a6 = {2, 2, 1, 1, 2, 2, 2, 2, 2, 2};
        int[] a7 = {1, 2, 2, 1, 1, 2, 2, 1, 1, 2};
        int[] a8 = {2, 2, 1, 1, 2, 0, 2, 0, 2, 1};

        sort012(a7);
        System.out.println(Arrays.toString(a7));

    }

    public static void sort012(int[] arr) {
        int low = 0;
        int middle = 0;
        int high = arr.length - 1;

        while(middle <= high) {

            int num = arr[middle];

            if (num == 0) {
                int temp = arr[low];
                arr[low] = arr[middle];
                arr[middle] = temp;
                ++low;
                ++middle;
            }

            else if (num == 1) ++middle;

            else if (num == 2) {
                int temp = arr[high];
                arr[high] = arr[middle];
                arr[middle] = temp;
                --high;
            }
        }
    }
}
