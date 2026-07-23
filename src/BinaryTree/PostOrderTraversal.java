package BinaryTree;

import java.util.*;


//Leetcode 145
//Time Complexity O(n) Space Complexity O(n) Auxiliary Space O(n) where n is the no of nodes
public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        if (root != null) st.push(root);
        while (st.size() > 0) {
            TreeNode top = st.pop();
            ans.add(top.val);

            if (top.left != null) st.push(top.left);
            if (top.right != null) st.push(top.right);
        }

        Collections.reverse(ans); //Auxiliary Space is O(n) because we use the array to reverse the order of the element
        return ans;
    }
}
