package Practice.Array_ArrayList;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1};
        int count = findMaxConsecutiveOnes(arr);
        System.out.println(count);
    }

//    Leetcode 485
//    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;

        int currentCount = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
