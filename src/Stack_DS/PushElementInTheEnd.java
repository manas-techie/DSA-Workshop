package Stack_DS;

import java.util.Stack;

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
    }

    public static void pushAtEnd(Stack<Integer> st, int n){
        if(st.size()==0) {
            st.push(n);
            return;
        }
        int top = st.pop();
        pushAtEnd(st, n);
        st.push(top);

    }
}
