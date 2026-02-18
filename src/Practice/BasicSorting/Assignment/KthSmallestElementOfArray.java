package Practice.BasicSorting.Assignment;

import java.util.Arrays;

public class KthSmallestElementOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 5, 7};
        int k = 3;
        int ele = KthSmallest(arr, k);
        System.out.println(ele);
    }

    public static int KthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
