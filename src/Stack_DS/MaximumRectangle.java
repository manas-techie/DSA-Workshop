package Stack_DS;

import java.util.Stack;

public class MaximumRectangle {
//    GFG
//    Time Complexity O(M*N) Auxiliary Space O(N)
    public int MaxArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        //pse
        int[] pse = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) pse[i] = -1;
            else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        while (!st.isEmpty()) st.pop();
        int[] area = new int[n];
        //nse
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                int nse = n;
                int currArea = arr[i] * (nse - pse[i] - 1);
                area[i] = currArea;
            } else {
                int nse = st.peek();
                int currArea = arr[i] * (nse - pse[i] - 1);
                area[i] = currArea;
            }
            st.push(i);
        }

        int largestArea = 0;
        for (int ele : area) {
            largestArea = Math.max(largestArea, ele);
        }

        return largestArea;

    }

    public int maxArea(int arr[][]) {
        // code here
        int m = arr.length;
        int n = arr[0].length;

        // except the first row because there is nothing above the first row
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] += arr[i - 1][j];
                }
            }
        }

        int largestArea = 0;
        for (int[] row : arr) {
            largestArea = Math.max(largestArea, MaxArea(row));
        }

        return largestArea;
    }

    //Leetcode
    class Solution {
        public int maxArea(int[] arr){
            int n = arr.length;
            Stack<Integer> st = new Stack<>();

            //pse
            int[] pse = new int[n];
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && arr[i]<= arr[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()) pse[i] = -1;
                else {
                    pse[i] = st.peek();
                }

                st.push(i);
            }
            while(!st.isEmpty()) st.pop();
            int[] area = new int[n];
            //nse
            for(int i = n-1; i>=0;i--){
                while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    int nse = n;
                    int currArea = arr[i]*(nse - pse[i] -1);
                    area[i] = currArea;
                } else {
                    int nse = st.peek();
                    int currArea = arr[i]*(nse - pse[i] -1);
                    area[i] = currArea;
                }
                st.push(i);
            }

            int largestArea = 0;
            for(int ele: area){
                largestArea = Math.max(largestArea, ele);
            }

            return largestArea;

        }
        public int maximalRectangle(char[][] arr) {
            int m = arr.length;
            int n = arr[0].length;

            int[] height = new int[n];
            int max = 0;

            for(int i=0; i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]== '1'){
                        height[j] += 1;
                    } else {
                        height[j] = 0;
                    }
                }
                max = Math.max(max,maxArea(height));

            }



            return max;
        }
    }
}
