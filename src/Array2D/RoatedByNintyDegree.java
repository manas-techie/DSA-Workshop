package Array2D;

public class RoatedByNintyDegree {
//    Leetcode 48
//    Time Complexity O(M*N) Space Commplexity O(1)
    public static void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        transpose(matrix);
        for (int i = 0; i < m; i++) {
            int a = 0, b = n - 1;
            while (a <= b) {
                swap(matrix[i], a, b);
                a++;
                b--;
            }
        }
    }

    public static void transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
