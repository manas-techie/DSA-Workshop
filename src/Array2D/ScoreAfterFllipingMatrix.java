package Array2D;

public class ScoreAfterFllipingMatrix {
//    Leetcode 861 Medium
//    Time complexity = O(n^2) Space Complexity = O(1) Auxillary space = O(1)
    public static int matrixScore(int[][] arr) {
        int m=arr.length, n=arr[0].length;
        //Make All element of first column to get the maximum score
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }


        //count no of Zeros and Ones in Each Columns except the First
        for(int j=1;j<n;j++){
            int noOfOnes=0, noOfZeros=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==1) noOfOnes++;
                else noOfZeros++;
            }

            if(noOfZeros>noOfOnes){
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }

        }

        //Count Score
        int Score=0,factor=1;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                Score += (arr[i][j]*factor);
            }
            factor *=2;
        }

        return Score;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int score = matrixScore(arr);
        System.out.println(score);
    }
}
