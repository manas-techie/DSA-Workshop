package Stack_DS;

import java.util.Stack;

public class BasketBallGame {
    //    Leetcode 682
//    T.C = S.C = A.C = O(N)
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                st.push(2 * st.peek());
            } else if (s.equals("+")) {
                int top = st.pop();
                int secTop = st.peek();
                st.push(top);
                st.push(top + secTop);
            } else {
                st.push(Integer.parseInt(arr[i]));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}
