package Stack_DS;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int getMaxArea(int arr[]) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] pse = new int[n];

        //Prevous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) pse[i] = -1; // no previous smaller element
            else {
                //store the index
                pse[i] = st.peek();
            }
            st.push(i);
        }

        //Next Smaller Element
        while (!st.empty()) st.pop();

        int[] nse = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) nse[i] = n; // no next smaller element
            else {
                //store the index
                nse[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int calArea = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(calArea, maxArea);
        }

        return maxArea;
    }
}
