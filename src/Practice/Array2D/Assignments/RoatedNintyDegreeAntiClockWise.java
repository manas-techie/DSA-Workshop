package Practice.Array2D.Assignments;

public class RoatedNintyDegreeAntiClockWise {
//    Assignment Question 9
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4,5,6},{7,8,9}};
        Rotate(arr);
        printMatrix(arr);
    }
//    Time Complexity O(m*n) // O(n^2)  because arr is square matrix , Space Complexity O(1) Auxiliary Space O(1)
    public static void Rotate(int[][] arr){
        int m = arr.length, n = arr[0].length;
//        Taking Transpose of the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
//        Swap the elements Columns Wise
        for(int j=0;j<n;j++){
            int a = 0;
            int b = n-1;
            while(a < b){
                int temp = arr[a][j];
                arr[a][j] = arr[b][j];
                arr[b][j] = temp;
                a++;
                b--;
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
