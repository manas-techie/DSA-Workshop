package AdvanceSorting.CyclicSort;

import java.sql.Time;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int dupEle = findDuplicate(arr);
        System.out.println(dupEle);
    }

    //    Leetcode 287
//    method 1 -> using Cyclic sort
//    Time Complexity O(n) Space Complexity O(1)
    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        while (true) {
            int ele = arr[0];
            if (arr[ele] == ele) {
                return ele;
            }
            swap(arr, 0, ele);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
