package MaximumSubarraySum;

public class MaximumSubarraySum {

    public static void main(String[] args) {

        int[] arr = {4, 12, -9, -4, 6, -3, 10};
        System.out.println(maxSubarraySum(arr, arr.length));

    }

    public static long maxSubarraySum(int[] arr, int n) {

        /*
        * Why is it okay to take `maxSoFar` as the minimum value and not something like a 0 as we did in `maxEndingHere` ?
        * the reason is that, `maxSoFar` will be used as a comparator unlike the `maxEndingHere`
        * the `maxEndingHere` will be used to add values to it, that's why we are not taking the minimum value for `maxEndingHere` initially
        * */
        long maxSoFar = Long.MIN_VALUE;
        long maxEndingHere = 0;

        for (int i : arr) {
            maxEndingHere = maxEndingHere + i;
            maxEndingHere = Long.max(maxEndingHere, i);
            maxSoFar = Long.max(maxSoFar, maxEndingHere);
        }

        return (maxSoFar < 0) ? 0 : maxSoFar;
    }
}
