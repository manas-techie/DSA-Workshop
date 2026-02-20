package BinarySearch;

public class CapacityToShipPackages {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int minC = shipWithinDays(arr, days);
        System.out.println(minC);

    }

    public static boolean ifPossible(int[] arr, int capacity, int d) {
        int load = 0;
        int n = arr.length;
        int daysTaken = 1;
        for (int i = 0; i < n; i++) {
            if (load + arr[i] <= capacity) {
                load += arr[i];
            } else {
                load = arr[i];
                daysTaken++;
            }
        }
        if (daysTaken > d) return false;
        return true;
    }

//    Leetcode 1011
//    Time Complexity O(nlog(sum-maxEle)) Space Complexity O(1) Auxiliary Space O(1)
    public static int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0, maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxEle = Math.max(arr[i], maxEle);
            sum += arr[i];
        }

        int low = maxEle, high = sum, minC = sum;
        while (low <= high) { //O(nlog(sum-maxEle))
            int mid = low + (high - low) / 2;
            if (ifPossible(arr, mid, d)) {
                minC = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return minC;
    }
}
