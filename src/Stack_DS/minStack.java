package Stack_DS;

import java.util.Stack;

//Leetcode 155
// Method 1
//Time Complexity O(1) Auxiliary Space O(1)
class MinStack2 {
    Stack<Long> st;
    long min;

    public MinStack2() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int value) {
        long val = (long) value;
        if (st.isEmpty()) {
            st.push(val);
            min = val;
        } else if (val < min) {
            st.push(2 * val - min);
            min = val;
        } else {
            st.push(val);
        }
    }

    public void pop() {
        if (st.peek() < min) {
            min = 2 * min - st.peek();
        }
        st.pop();
    }

    public int top() {
        if (st.peek() < min) {
            return (int) min;
        }
        long top = st.peek();
        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}

//Leetcode 155
//Method 2
//Time Complexity O(1) auxiliary space O(N)
class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();

    }

    public void push(int value) {
        if (st.isEmpty() || value < minSt.peek()) {
            st.push(value);
            minSt.push(value);
        } else {
            st.push(value);
            minSt.push(minSt.peek());
        }
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }

}

public class minStack {
    public static void main(String[] args) {

    }
}
