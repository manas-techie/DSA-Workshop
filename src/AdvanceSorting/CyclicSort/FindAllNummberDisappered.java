package AdvanceSorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllNummberDisappered {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    //    Leetcode 448
//    Time Complexity O(n) Space Complexity O(1)
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i + 1) {
                i++;
            } else if (arr[i] != i + 1 && arr[arr[i] - 1] == arr[i]) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
