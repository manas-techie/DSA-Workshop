package Practice.Array2D.Assignments;

public class StoreTenEachPlaces {

//    Assignment question 1
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int value = 10;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 10;
            }
        }
        printMatrix(arr);

    }

    public static void printMatrix(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
