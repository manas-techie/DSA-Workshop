package Stack_DS;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        // Time Complexity O(N) Space Complexity O(N) Auxiliary Space O(N)
        Stack<Integer> st_original= new Stack<>();

        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);

        System.out.println("Original Stack: " + st_original);

//        method 1

//        Stack<Integer> st_reverse = new Stack<>();
//
//        while(!st_original.isEmpty()){
//            st_reverse.push(st_original.pop());
//        }
//
//        Stack<Integer> st_final = new Stack<>();
//
//        while(!st_reverse.isEmpty()){
//            st_final.push(st_reverse.pop());
//        }
//
//        System.out.println("Final Stack: " + st_final);


//        method 2
        int[] temp = new int[st_original.size()];

        for(int i=0; i<temp.length; i++){
            temp[i] = st_original.pop();
        }

        Stack<Integer> st_ans = new Stack<>();

        for(int i = temp.length-1; i>=0; i--){
            st_ans.push(temp[i]);
        }
        System.out.println("Final Stack: " + st_ans);
    }
}
