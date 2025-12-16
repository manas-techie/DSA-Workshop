package Array2D;

public class RowWiseAndColWishPrint {
    public static void main(String[] args) {
        //1 4
        //2 5
        //3 6

        int[][] arr = {{1, 4}, {2, 5}, {3, 6}};
        int m = arr.length;
        int n = arr[0].length;
        //Row Wise Printing
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Column Wish Printing
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Transpose
        int[][] tran = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                tran[j][i] = arr[i][j];
                System.out.print(tran[j][i] + " ");
            }
            System.out.println();
        }
    }
}
