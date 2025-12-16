package Array2D;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] grid = new int[3][4];
        // manually initialization
//        grid[0][0] = 10;
//        grid[0][1] = 10;
//        grid[0][2] = 10;


        //this is length of the array
        int m = grid.length;
        //this is width of the array
        int n = grid[0].length;
        System.out.println("m = " + m + ", n = " + n);

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("grid[" + i + "][" + j + "]" + " = ");
                grid[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}
