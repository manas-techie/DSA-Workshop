package Queue;

import java.util.Queue;
import java.util.Stack;

//GFG
//Time Complexity O(N) Auxiliary Space O(N)
public class ReverseQueue {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();

        while(q.size()>0){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }
    }
}
