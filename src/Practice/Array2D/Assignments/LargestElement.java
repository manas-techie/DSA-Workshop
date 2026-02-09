package Practice.Array2D.Assignments;

public class LargestElement {
    //    Assignment Question 4
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 4, 6}, {2, 4, 5, 7}, {3, 5, 6, 8}, {4, 6, 7, 9}};

//        Time Complexity O(n^2)
        int m = arr.length, n = arr[0].length;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > maxEle) {
                    maxEle = arr[i][j];
                }
            }
        }
        System.out.println(maxEle);
    }

}

