package Stack_DS;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                int num = ascii - 48;
                String val = String.valueOf(num);
                st.push(val);
            } else {
                String val1 = st.pop();
                String val2 = st.pop();
                String val = val1 + val2 + ch;
                st.push(val);
            }
        }
        System.out.println(str);
        System.out.println(st.peek());
    }
}
