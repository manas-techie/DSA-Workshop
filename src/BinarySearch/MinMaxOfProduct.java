package BinarySearch;

public class MinMaxOfProduct {
    public static void main(String[] args) {
        int[] arr = {15, 10, 10};
        int x = minimizedMaximum(7, arr);
        System.out.println(x);
    }

    //    Leetcode 2064
//    Time Complexity O(nlogm) , where m is the maxEle-1 , Space Complexity O(1)
    public static boolean isPossible(int[] arr, int n, int x) {
        int stores = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % x == 0) {
                stores += arr[i] / x;
            } else {
                stores += arr[i] / x + 1;
            }
        }

        if (stores > n) return false;
        return true;
    }

    public static int minimizedMaximum(int n, int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxEle = Math.max(maxEle, arr[i]);
        }

        int low = 1, high = maxEle;
        int ans = maxEle;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, n, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
