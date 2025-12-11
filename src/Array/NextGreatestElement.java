package Array;

public class NextGreatestElement {
    public static void main(String[] args) {

        int[] arr = {12, 8, 9, 0, 3, 6, 45, 6, 34};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;

//        // method -> Brute Force approach

//        for (int i = 0; i < n - 1; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i + 1; j < n; j++) {
//                max = Math.max(max, arr[j]);
//            }
//            ans[i] = max;
//        }

        //method -> Optimize Approach
        int nge = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
