package Stack_DS;

import java.util.Stack;

//Leetcode 503

public class NextGreaterElemet2 {
    //    Time Complexity O(N) Space Complexity O(N) Auxiliary Space O(N)
    public static int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            st.push(arr[i]);
        }

        int[] ans = new int[n];

        int i = n - 1;
        while (i >= 0) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
            i--;
        }

        return ans;
    }

    //Brute Force
//    Time Complexity O(N^2) Auxiliary Space O(1) Space Complexity O(N)
    public static int[] nextGreaterBruteForce(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1;  // fill the array with -1 so if no greater element found by default it will be -1
            //search in loop
            for (int j = 1; j < n; j++) {
                int nextIdx = (i + j) % n;
                if (arr[nextIdx] > arr[i]) {
                    result[i] = arr[nextIdx];
                    break;
                }
            }
        }
        return result;
    }
}
