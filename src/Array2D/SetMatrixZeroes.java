package Array2D;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        printMatrix(matrix);
        setZeroes(matrix);
        printMatrix(matrix);


    }

//    Leetcode 73

//    Method 1 Worst Solution
//    Time Complexity O(m*n) Space Complexity O(m*n)

//    public static void setZeros(int[][] arr){
//        int m=arr.length,n=arr[0].length;
//        int[][] helperArr = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                helperArr[i][j] = arr[i][j];
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(helperArr[i][j]==0){
////                    set the ith row to zeroes
//                    for(int b=0;b<n;b++){
//                        arr[i][b]=0;
//                    }

    /// /                    set the jth column to zeroes
//                    for(int a=0;a<m;a++){
//                        arr[a][j]=0;
//                    }
//                }
//            }
//        }
//
//    }


    /// /Method 2 better method
    /// /Time Complexity O(m*n) Space Complexity(m+n)
//    public static void setZeroes(int[][] arr) {
//        int m=arr.length,n=arr[0].length;
//        //By default values in boolean array is false
//        boolean[] rowhelper = new boolean[m];
//        boolean[] colhelper = new boolean[n];
//
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i][j]==0){
//                    //mark the row as true
//                    rowhelper[i] = true;
//                    //mark the column as true
//                    colhelper[j] = true;
//                }
//            }
//        }
//
//        //set the 'true' rows as zeros
//        for(int i=0;i<m;i++){
//            if(rowhelper[i]==true){
//                for(int j=0;j<n;j++){
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//        //set the 'true' columns as zeros
//        for(int j=0;j<n;j++){
//            if(colhelper[j]==true){
//                for(int i=0;i<m;i++){
//                    arr[i][j] = 0;
//                }
//            }
//        }
//    }

//    Method 3 Best
//    Time Complexity O(n^2) Space complexity O(1)
    public static void setZeroes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        //initialize marker for 0th column and 0th row
        boolean zeroRowMarker = false;
        boolean zeroColMarker = false;

        //check and mark if there are any zeros in 0th col
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zeroColMarker = true;
                break;
            }
        }
        //check and mark if there are any zeros in 0th row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zeroRowMarker = true;
                break;
            }
        }

        //traversing through the array using the 0th row as rowMarker and 0th col as colMarker
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        //Sets Zeros in Rows , where 0th value is '0'
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        //Set Zeros in columns, where 0th value is '0'
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Handle 0th column based on marker
        if (zeroColMarker == true) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }

        // Handle 0th row based on marker
        if (zeroRowMarker == true) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
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
