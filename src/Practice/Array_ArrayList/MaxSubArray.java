package Practice.Array_ArrayList;

public class MaxSubArray {
    //Brute Force Method Time Complxity= O(n^2) and Space Complexity = O(1)
    public static int MaxSubArraySum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int CurrSum = 0;
            for (int j = i; j < arr.length; j++) {
                CurrSum += arr[j];

                res = Math.max(CurrSum, res);
            }
        }

        return res;

    }

    //Kadane's Algorithm time complexity O(n) space Complexity=O(1)
    public static int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = MaxSubArraySum(arr);
        System.out.println(result);

        int result2 = maxSubArray(arr);
        System.out.println(result2);
    }
}
