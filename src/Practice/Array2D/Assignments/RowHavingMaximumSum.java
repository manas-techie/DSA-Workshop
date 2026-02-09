package Practice.Array2D.Assignments;

public class RowHavingMaximumSum {
//    Assignment Question 5
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {3, 4, 7, 8}, {1, 4, 12, 3}};
        int m = arr.length, n = arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = -1;
        for (int i = 0; i < m; i++) {
            int currSum = 0;
            for (int j = 0; j < n; j++) {
                currSum += arr[i][j];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                maxSumIndex = i;
            }
        }
        if (maxSumIndex != -1)
            System.out.println("The " + (maxSumIndex + 1) + "th row is contain the maximum sum.");
    }
}
