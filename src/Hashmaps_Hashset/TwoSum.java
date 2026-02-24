package Hashmaps_Hashset;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }

    //    Leetcode 1
//    Brute Force
//    Time Complexity O(n^2) Space Complexity O(1)
    public static int[] twoSumBrute(int[] arr, int target) {
        int[] ans = new int[2];
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

    //    Optimized Approach -> HashMap
//    Time Complexity O(n) Space Complexity O(n)
    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remainValue = target - arr[i];
            if (map.containsKey(remainValue)) {
                ans[0] = i;
                ans[1] = map.get(remainValue);
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }
}
