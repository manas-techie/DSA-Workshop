package Practice.Stack_DS;

import java.util.Stack;

// Reverse the element with in the stack using recursion
// Time Complexity O(n^2) Space Complexity and Auxiliary Space O(n)
public class ReverseStackWithRecursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Stack: " + st);
        reverse(st);
        System.out.println("Reverse Stack: " + st);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.size() > 0) {
            int x = st.pop();
            reverse(st);
            insertAtBottom(st, x);
        }
    }

    public static void insertAtBottom(Stack<Integer> st, int x) {

        if (st.size() == 0) {
            st.push(x);
        } else {
            int top = st.pop();
            insertAtBottom(st, x);
            st.push(top);
        }
    }
}
