package Practice.Array2D.Assignments;

import java.util.Scanner;

public class ReturnTheSumBtwTwoCoordinates {
    //    Assignment Question 3
//    Given a matrix ‘A’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the rectangle from (l1,r1) to (l2, r2).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Coordinates: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.print("Enter the 2st Coordinates: ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int[][] arr = {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}

