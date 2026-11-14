package Stack_DS;

import java.util.Stack;

//GFC
public class CelebrityProblem {
    // Optimized Approach using stack
//    Time Complexity O(N) and Auxiliary Space O(N)
    public int celebrity(int arr[][]) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            boolean aFlag = true, bFlag = true;
            if (arr[a][b] == 1) { // a knows b => a can't be celebrity
                aFlag = false;
            } else { //arr[a][b] == 0 means a don't know b => b can't be celebrity
                bFlag = false;
            }

            if (arr[b][a] == 1) { // b knows a => b can't be celebrity
                bFlag = false;
            } else { // arr[b][a]==0 means b don't know a => a can't be celebrity
                aFlag = false;
            }

            if (aFlag) st.push(a);
            if (bFlag) st.push(b);
        }

        if (st.isEmpty()) return -1;

        int ele = st.pop();

        //checking if all other members know the ele(celebrity)
        for (int i = 0; i < n; i++) {
            if (i == ele) continue; //skip the celeb know celeb
            if (arr[i][ele] == 0) return -1; // no celebrity
        }

        //checking if ele(celeb) know any of other members
        for (int j = 0; j < n; j++) {
            if (j == ele) continue;
            if (arr[ele][j] == 1) return -1; // no celebrity
        }

        return ele;
    }
}
