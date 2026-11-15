package Stack_DS;

import java.util.Stack;

//Time Complexity O(N) Auxiliary Space O(N)
public class PrefixEvaution {
    public static void main(String[] args) {
        String str = "-9/*+5346";

        Stack<Integer> nums = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                int num = ascii - 48;
                nums.push(num);
            } else {
                int val1 = nums.pop();
                int val2 = nums.pop();
                if (ch == '-') nums.push(val1 - val2);
                if (ch == '+') nums.push(val1 + val2);
                if (ch == '*') nums.push(val1 * val2);
                if (ch == '/') nums.push(val1 / val2);
            }
        }
        System.out.println(str);
        System.out.println(nums.peek());
    }
}
