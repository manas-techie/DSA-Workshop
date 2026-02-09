package Practice.Array2D.Assignments;

public class PredictInput {
//    Assignment Question 7
//    public static void main(String[] args) {
//
//        int[][] matrix = {{1, 1, 2, 2}, {1, 2, 2, 4}, {1, 2,
//                3, 4}, {1, 4, 1, 2}};
//        int sum = 0;
//

    /// /        int col = matrix[0].length;
//        int col = matrix[0].length-1;
//        for (int row = 0; row < 4; row++) {
//
//            sum = sum + matrix[row][col];
//
//        }
//        System.out.println(sum);
//    }


//This program will give a error index 4 is out of bound because col has set to matrix[0],length which is 4 but the matrix can have maximum col index matrix[0].length - 1

//    Assignment Question 12
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};

        for (int i = 0; i < 2; i++)

            for (int j = 0; j < 2; j++)

                System.out.print(a[i][j]);

    }
}