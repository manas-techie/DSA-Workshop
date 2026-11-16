package Queue;

import java.util.Queue;
import java.util.Stack;

//gfg
//Time Complexity O(n) Auxiliary Space O(k)
public class ReverseFirstKthElements {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (k == 0 || k > q.size()) return q;
        // code here
        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <= k; i++) {
            st.push(q.remove());
        }

        while (st.size() > 0) {
            q.add(st.pop());
        }
        for (int i = 1; i <= q.size() - k; i++) {
            q.add(q.remove());
        }

        return q;
    }
}
