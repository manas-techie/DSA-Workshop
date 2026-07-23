package BinaryTree;


import java.util.*;


//Leetcode 94
//Time Complexity and Space Complexity = O(n) , Auxiliary Space is O(h) for average case and O(n) for wrost case
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode temp = root;

        while (true) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                if (st.size() == 0) break;
                TreeNode top = st.pop();
                ans.add(top.val);
                temp = top.right;
            }
        }

        return ans;
    }
}
