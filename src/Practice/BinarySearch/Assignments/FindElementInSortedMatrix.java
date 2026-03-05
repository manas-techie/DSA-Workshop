package Practice.BinarySearch.Assignments;

public class FindElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(isElementPresent(matrix, 3));
        System.out.println(isElementPresent(matrix, 13));
        System.out.println(isElementPresent2(matrix, 3));
        System.out.println(isElementPresent2(matrix, 13));
    }

    //    Assignment Question 9
//    Time Complexity O(logM + LogN) Space Complexity O(1)
    public static boolean isElementPresent(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;
        int col = matrix[0].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] <= target && matrix[mid][col] >= target) {
                int start = 0, end = col;
                while (start <= end) {
                    int center = start + (end - start) / 2;
                    if (matrix[mid][center] == target) return true;
                    else if (matrix[mid][center] < target) {
                        start = center + 1;
                    } else {
                        end = center - 1;
                    }
                }
                return false;
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }


    //    Method 2 - flatten the array
//    Time Complexity O(log(m*n))
    public static boolean isElementPresent2(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = row * col - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //mid / col -> gives us the current row and mid % col gives the current col
            if (matrix[mid / col][mid % col] == target) return true;
            else if (matrix[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
