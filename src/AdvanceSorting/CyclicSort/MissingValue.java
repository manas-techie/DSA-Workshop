package AdvanceSorting.CyclicSort;

public class MissingValue {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int missEle = missingNumber2(arr);
        System.out.println(missEle);
    }

    //    Leetcode 268
//    Method 1
//    Time Complexity O(n) Space Complexity O(n)
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        boolean[] marker = new boolean[n + 1];
        for (int ele : arr) {
            marker[ele] = true;
        }

        for (int i = 0; i <= n; i++) {
            if (marker[i] == false) {
                return i;
            }
        }
        return -1;
    }

    //    method 2
//    Time Complexity O(n) Space Complexity O(1)
    public static int missingNumber2(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i || arr[i] == n) i++;
            else {
                swap(arr, i, arr[i]);
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return n;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //    Method 3
    public static int missingNumber3(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int ele : arr) {
            actualSum += ele;
        }

        return expectedSum - actualSum;
    }
}
