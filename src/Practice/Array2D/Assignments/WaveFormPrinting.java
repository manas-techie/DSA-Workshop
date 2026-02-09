package Practice.Array2D.Assignments;

public class WaveFormPrinting {
//    Assignment Question 10
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        WaveForm(arr);
    }
    public static void WaveForm(int[][] arr){
        int m = arr.length, n=arr[0].length;
        for (int j = 0; j < n; j++) {
            if(j%2==0) {
                for (int i = m-1; i >= 0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
