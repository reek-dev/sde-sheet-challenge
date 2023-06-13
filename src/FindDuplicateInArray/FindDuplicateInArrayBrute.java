package FindDuplicateInArray;

import java.util.*;

public class FindDuplicateInArrayBrute {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 3, 4, 2)) ;

        System.out.println(findDuplicate(list, list.size()));
    }

    public static int findDuplicate(ArrayList<Integer> arr, int n){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
            if (map.get(i) == 2) return i;
        }

        return -1;
    }
}
