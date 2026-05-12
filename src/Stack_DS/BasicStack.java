package Stack_DS;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.print("Stack is: ");
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }

//        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st.pop());
//        System.out.println(st);
//
//        System.out.println(st.isEmpty());
//        System.out.println(st.size() );
    }
}
