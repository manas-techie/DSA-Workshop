package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static List<List<Integer>> arr;

//    Leetcode 78
//    Time Complexity O(N*2^n) Space Complexity O(N*2^n) Auxiliary Space O(N)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, nums, ans);
        return arr;
    }

    public static void helper(int i, int[] nums, ArrayList<Integer> ans) {
        if (i == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int x = 0; x < ans.size(); x++) {
                list.add(ans.get(x));
            }
            arr.add(list);
            // arr.add(new ArrayList<>(ans));
            return;
        }
        helper(i + 1, nums, ans); //skip
        int num = nums[i];
        ans.add(num);
        helper(i + 1, nums, ans); //take
        ans.remove(ans.size() - 1);
    }
}
