package Practice.Array_ArrayList;

public class MaximumSubarry {
    //Leetcode 53
    //Use Kadane's algorithm
//    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static int maxSubArray(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            //Adding array element to the sub array
            currSum += arr[i];
            //check is the current Subarray's sum greater than the previous subarray sum
            maxSum = Math.max(currSum, maxSum);

//            if currSum is < 0, we can't get a larger sum by adding element to the previous sub array so start new subarray
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,5,7,8,};
        int maxSum = maxSubArray(arr);
        System.out.println(maxSum);
    }
}
