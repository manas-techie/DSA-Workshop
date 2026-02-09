package Practice.Array2D.Assignments;

import java.util.Scanner;

public class AddElementsInSpiralOrder {
    //    Assignment Question 11
//    Given a positive integer n, generate a n x n matrix filled with elements from 1 to n2 in spiral order.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        AddEleInSpiralOrder(arr);
        printMatrix(arr);


    }

//    Time Complexity O(n^2) Space Complexity O(1) Auxiliary Space O(1)
    public static void AddEleInSpiralOrder(int[][] arr) {
        int n = arr.length;
        int value = 1;
        int minr = 0, maxr = n - 1;
        int minc = 0, maxc = n - 1;
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {
                arr[minr][j] = value;
                value++;
            }
            minr++;

            for (int i = minr; i <= maxr; i++) {
                arr[i][maxc] = value;
                value++;
            }
            maxc--;

            if (minr <= maxr) {
                for (int j = maxc; j >= minc; j--) {
                    arr[maxr][j] = value;
                    value++;
                }
                maxr--;
            }

            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    arr[i][minc] = value;
                    value++;
                }
                minc++;
            }
        }
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
