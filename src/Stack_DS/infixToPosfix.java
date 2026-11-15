package Stack_DS;

import java.util.Stack;

public class infixToPosfix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";

        Stack<String> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                int num = ascii - 48;
                String val = String.valueOf(num);
                nums.push(val);
            } else if (ops.isEmpty() || ch == '(' || ops.peek() == '(') {
                ops.push(ch);
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    String val2 = nums.pop();
                    String val1 = nums.pop();
                    char op = ops.pop();
                    nums.push(val1 + val2 + op);
                }
                ops.pop(); //remove '('
            } else {
                if (ch == '+' || ch == '-') {
                    //We will alaway have to do operations
                    String val2 = nums.pop();
                    String val1 = nums.pop();
                    char op = ops.pop();
                    nums.push(val1 + val2 + op);
                    ops.push(ch); // insert current operator

                } else if (ch == '*' || ch == '/') {
                    if (ops.peek() == '*' || ops.peek() == '/') {
                        String val2 = nums.pop();
                        String val1 = nums.pop();
                        char op = ops.pop();
                        nums.push(val1 + val2 + op);
                        ops.push(ch); // insert current operator
                    } else {
                        ops.push(ch);
                    }
                }
            }
        }
        while (nums.size() > 1) {
            String val2 = nums.pop();
            String val1 = nums.pop();
            char op = ops.pop();
            nums.push(val1 + val2 + op);
        }

        System.out.println(str);
        System.out.println(nums.peek());
    }
}
