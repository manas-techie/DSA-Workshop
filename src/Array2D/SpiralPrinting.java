package Array2D;

import java.sql.SQLOutput;

public class SpiralPrinting {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        Spiral Print
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;
        while (minr <= maxr && minc <= maxc) {
//            left to right
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
//            Top to bottom
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc]);
            }
            maxc--;
//            Right to Left
            
        }
    }
}
