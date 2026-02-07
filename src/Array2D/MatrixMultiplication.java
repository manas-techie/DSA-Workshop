package Array2D;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        int[][] b = {{1, 0, 1, 2}, {2, 1, 0, 0}, {0, 3, 1, 1}};

        MatrixMultiplication(a, b);
    }

    public static void MatrixMultiplication(int[][] a, int[][] b) {
        int R1 = a.length; //row of matrix1
        int C1 = a[0].length; //column of matrix1
        int R2 = b.length; // row of matrix2
        int C2 = b[0].length; //column of matrix2

        if (C1 == R2) {
            int[][] result = new int[R1][C2];
            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C2; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < R2; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }


            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
