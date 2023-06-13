package MajorityElement;

/*
* You are given an array/list consisting of N integers
* the task is to find the majority element in the array
* a majority element is an element that occurs more than floor(N/2) times
*
* */


public class MajorityElementOptimal {
    public static void main(String[] args) {

        int[] a = {2,3,9,2,2,2};

        System.out.println(findMajority(a, a.length));

    }

    public static int findMajority(int[] arr, int n) {

        // assume that the first element is the majority element
        int majorityElement = arr[0];
        int majorityCount = 1;

        // start the loop from the index 1 because the index 0 is already assumed to be majority
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == majorityElement)
                ++majorityCount;
            else
                --majorityCount;

            // if a particular portion becomes zero then that the current i will be the majority
            if (majorityCount == 0) {
                majorityElement = arr[i];
                majorityCount = 1;
            }
        }

        int occurenceCount = 0;
        for (int i : arr)
            if (i == majorityElement) ++occurenceCount;

        return (occurenceCount > n/2) ? majorityElement : -1;
    }
}
