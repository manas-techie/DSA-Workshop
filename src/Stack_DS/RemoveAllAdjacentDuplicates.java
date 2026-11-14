package Stack_DS;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
//    Leetcode 1047
//    Time Complexity O(N) Space Complexity O(N) Auxiliary Space O(N)
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();


        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.pop();
            sb.append(ch);
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaabbbb"));
    }
}


// using two pointer
class Solution {
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        int i = 0; // Pointer representing current write position (top of stack)

        for (int j = 0; j < chars.length; j++) {
            // If top of stack matches current character, pop (move write pointer back)
            if (i > 0 && chars[i - 1] == chars[j]) {
                i--;
            } else {
                // Otherwise push (write character and move forward)
                chars[i] = chars[j];
                i++;
            }
        }

        return new String(chars, 0, i);
    }
}

//using stringbuilder
class Solution2 {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int len = sb.length();

            // If the last character matches the current one, pop it
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}