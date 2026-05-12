package Stack_DS;

import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {
        // Time Complexity O(N) Space Complexity O(N) Auxiliary Space O(N)
        Stack<Integer> st_original= new Stack<>();

        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);

        System.out.println("Original Stack: " + st_original);

        Stack<Integer> st_reverse = new Stack<>();

        while(!st_original.isEmpty()){
            int ele = st_original.pop();
            st_reverse.push(ele);

            //
//            st_reverse.push(st_original.pop());
        }

        System.out.println("Reversed Stack: "+ st_reverse);
    }
}
