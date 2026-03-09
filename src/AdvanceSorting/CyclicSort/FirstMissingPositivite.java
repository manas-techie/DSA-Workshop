package AdvanceSorting.CyclicSort;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositivite {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int ele = firstMissingPositive3(arr);
        System.out.println(ele);
    }

    //    Leetcode 41
//    brute force
//    Time Complexity O(n^2) , Space Complexity O(1)
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        for (int num = 1; num <= n + 1; num++) {
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return num;
            }
        }
        return -1;
    }

    //    Better approach
//    Time Complexity O(n) Space Complexity O(n)
    public static int firstMissingPositive2(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();

        for (int ele : arr) {
            set.add(ele);
        }


        for (int num = 1; num <= n + 1; num++) {
            if (!set.contains(num)) {
                return num;
            }
        }
        return -1;
    }

    //    Optimizeed Approach
//    Time Complexity O(n) Space Complexity O(1)
    public static int firstMissingPositive3(int[] arr) {
        int n = arr.length;

        int i = 0;
        while (i < n) {
            int idx = arr[i] - 1;
            if (arr[i] <= 0 || arr[i] == i + 1 || arr[i] > n || arr[i] == arr[idx]) {
                i++;
            } else {
                swap(arr, i, idx);
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
