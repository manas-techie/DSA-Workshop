package Stack_DS;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                int num = ascii - 48;
                String val = String.valueOf(num);
                st.push(val);
            } else {
                String val2 = st.pop();
                String val1 = st.pop();
                String val = "(" + val1 + ch + val2 + ")";
                st.push(val);
            }
        }
        System.out.println(str);
        System.out.println(st.peek());
    }
}
