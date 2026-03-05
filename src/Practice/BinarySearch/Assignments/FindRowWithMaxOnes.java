package Practice.BinarySearch.Assignments;

public class FindRowWithMaxOnes {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int maxRow = rowWithMaxOnes(matrix);
        System.out.println(maxRow);

        int maxRow2 = maxNoOfOnesRow(matrix);
        System.out.println(maxRow2);
    }

    //    Assignment Question 3
//    Time Complexity O(NlogM), where N = length of row of matrix and M = column of matrix
//    Space Complexity O(1)
    public static int rowWithMaxOnes(int[][] matrix) {
        int maxOnes = -1;
        int maxRow = -1;
        for (int i = 0; i < matrix.length; i++) {
            int currRowOnes = noOfOnes(matrix[i]);
            if (currRowOnes > maxOnes) {
                maxOnes = currRowOnes;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static int noOfOnes(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int firstOccur = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                firstOccur = mid;
                high = mid - 1; //try to find the first occurrence
            } else {
                low = mid + 1; //Because this is binary array contain only 0 and 1
            }
        }
        if (firstOccur != -1) {
            return n - firstOccur;
        }
        return -1;
    }

    //    Optimized Approach
//    Time Complexity O(M+N) Space Complexity O(1)
    public static int maxNoOfOnesRow(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int maxRow = -1;
        int i = 0, j = col - 1;
        while (i < row && j >= 0) {
            if (matrix[i][j] == 1) {
                maxRow = i; //remember the row
                j--; //move left
            } else { //if the element is 0
                i++; //move down
            }
        }
        return maxRow;
    }
}
