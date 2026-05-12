package Stack_DS;

import java.util.Scanner;
import java.util.Stack;

public class DisplayReverseStackRecursively {
    // Time Complexity O(N) Space Complexity O(N) -> recursive space
    public static void displayReverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.println(top);
        displayReverseStack(st);
        st.push(top); //to restore the stack into its original order
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        displayReverseStack(st);
    }
}
