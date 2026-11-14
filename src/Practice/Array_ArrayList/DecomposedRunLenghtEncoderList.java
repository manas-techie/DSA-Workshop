package Practice.Array_ArrayList;

import java.util.ArrayList;

//Leetcode 1313

class Solution {
//    public int[] decompressRLElist(int[] arr) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int len = arr.length;
//
//        for (int i = 0; i < len; i += 2) {
//            int freq = arr[i];
//            int val = arr[i+1];
//            for(int count = 0; count<freq; count++){
//                ans.add(val);
//            }
//        }
//        return ans.stream().mapToInt(Integer::intValue).toArray();
//    }

//    preffered
//    TC = O(n + m) SC = O(1)
    public int[] decompressRLElist(int[] nums) {
        // 1. Calculate the total size of the decompressed array
        int totalLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalLength += nums[i];
        }

        // 2. Allocate the result array
        int[] result = new int[totalLength];
        int writeIdx = 0;

        // 3. Fill the array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq-- > 0) {
                result[writeIdx++] = val;
            }
        }

        return result;
    }
}