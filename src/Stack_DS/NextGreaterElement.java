package Stack_DS;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
//    Geeksforgeek
//    TimE Complexity O(N) Space Complexity O(N)
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++){
            ans.add(i, 0);
        }
        ans.set(n-1,-1);

        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.set(i,-1);
            } else {
                ans.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        ArrayList<Integer> ans = nextLargerElement(arr);
        System.out.println(ans);
    }
}
