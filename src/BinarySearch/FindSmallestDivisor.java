package BinarySearch;

public class FindSmallestDivisor {
    public static void main(String[] args) {
        int[] arr = {44, 22, 33, 11, 1};
        int t = 5;
        int divisor = smallestDivisor(arr, t);
        System.out.println(divisor);
    }

    //    Leetcode 1283
//    method 1 => Brute Force approach
//    Time Complexity O(n*m) n=of elements in array and m = largest integer in array, Space Complexity O(1)
    public static int smallestDivisor1(int[] arr, int t) {
        int n = arr.length;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxEle = Math.max(maxEle, arr[i]);
        }
        int d;
        for (d = 1; d <= maxEle; d++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % d == 0) {
                    sum += arr[i] / d;
                } else {
                    sum += arr[i] / d + 1;
                }
            }
            if (sum <= t) return d;
        }
        return -1;
    }


    //  method 2 => Optimized Approach
//    Time Complexity O(nlog(m)), n = no of element is array , m = greatest element in array, Space Complexity O(1)
    public static boolean isLess(int[] arr, int mid, int t) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //O(n)
            if (arr[i] % mid == 0) {
                sum += arr[i] / mid;
            } else {
                sum += arr[i] / mid + 1;
            }
        }
        if (sum <= t) return true;
        return false;
    }

    public static int smallestDivisor(int[] arr, int t) {
        int n = arr.length;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxEle = Math.max(maxEle, arr[i]);
        }
        int d = -1;
        int low = 1;
        int high = maxEle;
        while (low <= high) { //O(log(maxEle))
            int mid = low + (high - low) / 2;

            if (isLess(arr, mid, t)) {
//                if element found which satisfy the condition try to found smallest divisor, which satisfy the condition
                d = mid;
                high = mid - 1;
            } else {
//                sum is greater than threshold , increase the divisor value
                low = mid + 1;
            }
        }

        return d;
    }

}

