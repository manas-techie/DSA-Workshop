package Array2D;

public class SearchInMatrix {

//    Time Complexity O(n^2)
    public static boolean searchUnoptimized(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) return true;
            }
        }
        return false;
    }

    //Leetcode 240 Medium
//    Time Complexity O(n) and Space Complexity O(1) Auxillary Sapce O(1)
    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            }
            //If element is greater than target, target should exist in the left side of arr element
            else if (arr[i][j] > target) {
                j--;
            }
            //If target > element , target should be exists in the bottom or right , we already check right so move to bottom
            else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        boolean elementExists = searchMatrix(matrix, 5);
        System.out.println(elementExists);

        boolean elementExists2 = searchUnoptimized(matrix, 6);
        System.out.println(elementExists2);
    }
}
