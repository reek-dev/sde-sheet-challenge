package PairSum;

import java.util.*;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        List<int[]> pairs = pairSum(arr, target);

        for (int[] a : pairs)
            System.out.print(a[0] + " " + a[1] + "\n");

    }

    // `Comparator` is a functional interface
    static Comparator<int[]> comparator = new Comparator<int[]>() {
        @Override
        public int compare(int[] array1, int[] array2) {

            /*
             * we only need to sort based on the first index values of the arrays, and not the second
             * why? because in the list, all elements inside each array add up to a particular target sum (s).
             * so it means that if in two arrays, the first values are m and m (same),
             * then the second values for both of these arrays will have to be (k - m)
             * which essentially means two identical arrays, and they do not need to be sorted.
             *
             * e.g. target = 7; now if the first value of the arrays are 2, then the second value
             * will have to be a 5, essentially means two arrays are [2, 5] and [2, 5]
             */

            /*
             * the compare() method will compare the two values
             * it will return -1 if the first value is lesser than the second value
             * it will return 0 if the first value is equal to the second value
             * it will return 1 if the first value is greater than the second value
             */
            return Integer.compare(array1[0], array2[0]);
        }
    };

    public static List<int[]> pairSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for (int num : arr) {
            int remainingValue = target - num;

            if (map.containsKey(remainingValue)) {
                for (int i = 0; i < map.get(remainingValue); ++i) {

                    // we need to store the minimum value first and then the maximum value in the pair
                    // e.g. [4, 1] is not a valid pair but [1, 4] is
                    int[] pair = {Math.min(num, remainingValue), Math.max(num, remainingValue)};
                    list.add(pair);
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        list.sort(comparator);
        return list;
    }
}
