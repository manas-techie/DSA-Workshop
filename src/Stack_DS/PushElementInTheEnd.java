package Stack_DS;

import java.util.Stack;


//Recursive Method
public class PushElementInTheEnd {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        pushAtEnd(st, 6);
        System.out.println(st);


        reverse(st);
        System.out.println(st);
    }


    // push at bottom
    // Time and Space Complexity O(n) , Auxiliary Space O(n)
    public static void pushAtEnd(Stack<Integer> st, int n) {
        if (st.size() == 0) {
            st.push(n);
            return;
        }
        int top = st.pop();
        pushAtEnd(st, n);
        st.push(top);

    }

    // reverse the stack recursively
    // Time and Space Complexity O(n^2), Auxiliary Space O(n^2)
    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        reverse(st);
        pushAtEnd(st, top);
    }
}
