package Practice.Array_ArrayList;

public class RepeatAndMissingNumberArray {
//    Repeat and missing number array
//    interviewbit 60
//    Time complexity O(nlong) Space Complexity O(1)
//    public static int[] repeatedNumber(final int[] arr) {
//        int[] ans = new int[2];
//
//        if(arr[0]!= 1){
//            ans[1]=1;
//        }
//        if(arr.length==2){
//            if(arr[0]==1 && arr[1]==1){
//                ans[0]=1;
//                ans[1]=2;
//            }
//            else{
//                ans[0]=2;
//                ans[1]=1;
//            }
//        }
//        Arrays.sort(arr);
//        int n = arr.length;
//        for(int i=0;i<n-1;i++){
//            if(arr[i]==arr[i+1]){
//                ans[0] = arr[i];
//            }
//            else if(arr[i+1]!=arr[i]+1){
//                ans[1] = arr[i]+1;
//            }
//        }
//        return ans;
//    }

//    Time Complexity O(n) Space Complexity O(1) Auxiliary Space O(1)
    public static int[] repeatedNumber(final int[] arr) {
        long n = arr.length;

        long expectedSum = n*(n+1)/2;
        long expectedSquarSum = n*(n+1)*(2*n+1)/6;


        long actualSum = 0;
        long actualSquarSum = 0;

        for(int i=0;i<n;i++){
            actualSum += arr[i];
            actualSquarSum += (long) arr[i]*arr[i];
        }

        long diff = actualSum - expectedSum; //A-B
        long squarDiff = actualSquarSum - expectedSquarSum; //A^2 - B^2
        long sum = squarDiff / diff; //A+B

        int A = (int)(sum + diff) /2;
        int B = (int)(sum - diff) /2;

        return new int[]{A,B};

    }
}
