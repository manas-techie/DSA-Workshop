package Stack_DS;

import java.util.Stack;

public class TraverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> st_temp = new Stack<>();

        System.out.println("The Stack Elements are: ");
        while (st.size() != 0) {
            int top = st.pop();
            System.out.println("| " + top + " |");
            st_temp.push(top);
        }
        System.out.print("|___|");


        while (st_temp.size() != 0) {
            st.push(st_temp.pop());
        }
    }
}
