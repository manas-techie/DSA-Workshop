package Stack_DS;

import java.util.ArrayList;
import java.util.Stack;

class Pair {
    int val;
    int idx;

    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

//GFG
//Time Complexity O(N) Auxiliary Space O(N) Space COmplexity O(N)
public class StockSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here

        Stack<Pair> st = new Stack<>();

        int len = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            ans.add(i, 0);
        }

        int i = 0;
        while (i < len) {
            while (!st.isEmpty() && st.peek().val <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                int spanVal = i - (-1);
                ans.set(i, spanVal);
            } else {
                int spanVal = i - (st.peek().idx);
                ans.set(i, spanVal);
            }

            st.push(new Pair(arr[i], i));
            i++;
        }

        return ans;
    }


    //    Using the same method without using Pair instead only store index in stack
    public ArrayList<Integer> calculateSpan2(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        ArrayList<Integer> ans = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            ans.add(i, 0);
        }

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                int spanVal = i - (-1);
                ans.set(i, spanVal);
            } else {
                int idx = st.peek();
                int spanVal = i - idx;
                ans.set(i, spanVal);
            }
            st.push(i);
        }

        return ans;
    }
}
