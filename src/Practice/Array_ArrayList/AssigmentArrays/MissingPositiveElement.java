package Practice.Array_ArrayList.AssigmentArrays;

import java.util.Arrays;

public class MissingPositiveElement {
    public static int missingPositiveEle(int[] arr) {
        int x = 1;
        Arrays.sort(arr);//If the array is sorted we can skip this sorting part
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) continue;
            if (arr[i] == x) {
                x++;
            } else if (arr[i] > x) {
                return x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {-4, 2, 4, 5, 1, -5, -8};
        int result = missingPositiveEle(arr);
        System.out.println(result);
    }
}
