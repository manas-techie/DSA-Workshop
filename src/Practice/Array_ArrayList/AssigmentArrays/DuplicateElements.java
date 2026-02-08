package Practice.Array_ArrayList.AssigmentArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    // This is not optimal is having time complexity of O(n^2)
    public static ArrayList<Integer> DuplicateEle(int[] arr) {
        Arrays.sort(arr); //nlogn
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) { //n time complexity //n-1 because there is condition in if i+1 if we take n , out of bound error occur.
            if (arr[i] == arr[i + 1] && !result.contains(arr[i])) { //n time complexity
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 4, 4, 6, 5, 2, 7, 2, 6, 8, 3, 5};
        ArrayList<Integer> result = DuplicateEle(arr);
        System.out.println(result);
    }
}
