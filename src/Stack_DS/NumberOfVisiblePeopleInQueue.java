package Stack_DS;

import java.util.Stack;

public class NumberOfVisiblePeopleInQueue {
    //Leetcode 1944 Hard
    //Time Complexity O(N) Space Complexity O(N)
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];
        st.push(arr[n - 1]);
        ans[n - 1] = 0; //last element

        for (int i = n - 2; i >= 0; i--) {
            int count = 0;
            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
                count++;
            }

            if (!st.isEmpty()) count++;
            ans[i] = count;
            st.push(arr[i]);
        }

        return ans;
    }
}
