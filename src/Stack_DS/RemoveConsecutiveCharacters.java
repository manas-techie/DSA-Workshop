package Stack_DS;

import java.util.Stack;


//Time Complexity = O(N + K^2) Space Complexiy O(N) AUxiliatry Space = O(N)
// Not an optimal Sol
public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String str = "aaaaabbbcccdaa";
        String ans = removeConsective(str);
        System.out.println(ans);
    }
    public static String removeConsective(String str){
        Stack<Character> st = new Stack<>();

        for(char c: str.toCharArray()){
            if(st.isEmpty())
                st.push(c);
            else if(c != st.peek()){
                st.push(c);
            }
        }

        String ans = new String();
        while(!st.isEmpty()){
            char top = st.pop();
            ans = top + ans; //T.C = O(k^2)
        }

        return ans;
    }
}
