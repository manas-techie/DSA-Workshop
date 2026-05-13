package Stack_DS;

import java.util.Stack;

public class ValidParentheses {
//    Leetcode 20
//    Time Complexity O(N) Space Complexity O(N)
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){

            if(c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if(c == '[')
                st.push(']');
            else if(st.isEmpty() || st.pop() != c)
                return false;
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
