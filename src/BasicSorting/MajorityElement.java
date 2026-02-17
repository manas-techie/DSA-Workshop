package BasicSorting;

import java.util.Arrays;

public class MajorityElement {
    //    Leetcode 169
//    This is not the optimal approach use moor's voting algo to solve this in O(n)
//    Time Complexity O(nlog)
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int majorEle = majorityElement(arr);
        System.out.println(majorEle);
    }

    public static int majorityElement(int[] nums) {
        //2,2,1,1,1,2,2
        //sort => 1,1,1,2,2,2,2
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
