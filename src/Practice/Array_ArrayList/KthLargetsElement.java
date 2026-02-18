package Practice.Array_ArrayList;

import java.util.Arrays;

public class KthLargetsElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int ele = findKthLargest(arr, k);
        System.out.println(ele);
    }

    //    Time Complexity O(nlogn) Space Complexity O(1)
    public static int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - k];

    }
}
