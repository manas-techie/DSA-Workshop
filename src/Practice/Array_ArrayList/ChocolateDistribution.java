package Practice.Array_ArrayList;

import java.util.Arrays;

public class ChocolateDistribution {
    //Time complexity = O(nlogn) because of Arrays.sort() which use quick sort Space Complexity = O(1)
    public static int MinDistrubutionGap(int[] arr, int m) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE, newdiff = 0;
        for (int i = 0; i + m - 1 < arr.length; i++) {
            newdiff = arr[i + m - 1] - arr[i];
            if (newdiff < diff) {
                diff = newdiff;
            }
        }
        return diff;
    }

//    if arr is a arraylist
//    public static int findMinDiff(ArrayList<Integer> arr, int m) {
//        // your code here
//        //For finding length of arraylist
//        int n = arr.size();
//        int minDiff = Integer.MAX_VALUE;
//        //sort the arraylist - use Collections for arrayList
//        Collections.sort(arr);
//        for (int i = 0; i <= n - m; i++) {
//            int currdiff = arr.get(i + m - 1) - arr.get(i);
//            minDiff = Math.min(currdiff, minDiff);
//        }
//        return minDiff;
//    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        int result = MinDistrubutionGap(arr, m);
        System.out.println(result);
    }
}
