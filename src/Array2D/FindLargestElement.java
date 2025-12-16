package Array2D;

public class FindLargestElement {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 5}, {8, -9, 12}, {8, 34, 12}};
        int m = arr.length;
        int n = arr[0].length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx, arr[i][j]);
            }
        }
        System.out.println("The maximum number in the array is " + mx);
    }
}
