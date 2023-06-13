package MajorityElement;

/*
* You are given an array/list consisting of N integers
* the task is to find the majority element in the array
* a majority element is an element that occurs more than floor(N/2) times
*
* */

import java.util.HashMap;
import java.util.Map;

public class MajorityElementBetter {
    public static void main(String[] args) {

        int[] a = {2,3,9,2,2,2};

        System.out.println(findMajority(a, a.length));
    }

    public static int findMajority(int[] arr, int n) {
        int threshold = n/2;

        Map<Integer, Integer> map = new HashMap<>();

//        for (int i : arr) {
//            if (map.containsKey(i)) map.put(i, map.get(i)+1);
//            else map.put(i, 1);
//        }
//
//        for(Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
//            if (mapElement.getValue() > threshold) return mapElement.getKey();
//        }
//
//        return -1;

        for(int i : arr)
            map.merge(i, 1, Integer::sum);

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(-1);

    }
}
