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
