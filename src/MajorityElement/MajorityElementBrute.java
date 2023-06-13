package MajorityElement;

/*
* You are given an array/list consisting of N integers
* the task is to find the majority element in the array
* a majority element is an element that occurs more than floor(N/2) times
*
* */

public class MajorityElementBrute {
    public static void main(String[] args) {

        int[] a = {2,3,9,2,2,3};

        System.out.println(findMajority(a, a.length));
    }

    public static int findMajority(int[] arr, int n) {
        int threshold = n/2;

        for (int i = 0; i < n; ++i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (arr[j] == arr[i]) ++count;
            }

            if (count > threshold) return arr[i];
        }

        return -1;

    }
}
