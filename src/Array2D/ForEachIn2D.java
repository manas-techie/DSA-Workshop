package Array2D;

public class ForEachIn2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {2, 3, 4, 5}};
        for (int[] ele : arr) {
            for (int item : ele) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
