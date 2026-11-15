package Stack_DS;

import java.util.Stack;

// Time Complexity O(N) Auxiliary Space O(N)
public class InfixExpression {
    public static void main(String[] args) {
        String expression = "9-(5+3)*4/6";

        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {// character is  number
                int num = ascii - 48;
                nums.push(num);
            } else if (ops.isEmpty() || ch == '(' || ops.peek() == '(') {
                ops.push(ch);
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    int val2 = nums.pop();
                    int val1 = nums.pop();
                    if (ops.peek() == '+') nums.push(val1 + val2);
                    if (ops.peek() == '-') nums.push(val1 - val2);
                    if (ops.peek() == '*') nums.push(val1 * val2);
                    if (ops.peek() == '/') nums.push(val1 / val2);
                    ops.pop();
                }
                ops.pop(); // remove '(' from stack
            } else {
                if (ch == '+' || ch == '-') {
                    //We will alaway have to do operations
                    int val2 = nums.pop();
                    int val1 = nums.pop();
                    if (ops.peek() == '+') nums.push(val1 + val2);
                    if (ops.peek() == '-') nums.push(val1 - val2);
                    if (ops.peek() == '*') nums.push(val1 * val2);
                    if (ops.peek() == '/') nums.push(val1 / val2);
                    ops.pop(); // remove the operator
                    ops.push(ch); // insert current operator

                } else if (ch == '*' || ch == '/') {
                    if (ops.peek() == '*' || ops.peek() == '/') {
                        // we only do operations with higher or equal operator's president order
                        int val2 = nums.pop();
                        int val1 = nums.pop();
                        if (ops.peek() == '*') nums.push(val1 * val2);
                        if (ops.peek() == '/') nums.push(val1 / val2);
                        ops.pop(); // remove the operator
                        ops.push(ch); // insert current operator
                    } else {
                        ops.push(ch);
                    }
                }
            }
        }
        while (nums.size() > 1) {
            int val2 = nums.pop();
            int val1 = nums.pop();
            if (ops.peek() == '+') nums.push(val1 + val2);
            if (ops.peek() == '-') nums.push(val1 - val2);
            if (ops.peek() == '*') nums.push(val1 * val2);
            if (ops.peek() == '/') nums.push(val1 / val2);
            ops.pop();
        }

        System.out.println(expression);
        System.out.println(nums.peek()); //ans;
    }
}
