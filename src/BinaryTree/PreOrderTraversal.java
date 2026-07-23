package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//Leetcode 144
//Time Complexity O(n) Space Complexity O(n) Auxiliary Space O(h) where n is the no of nodes and h is the height of the tree
public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (st.size() > 0) {
            TreeNode top = st.pop();
            ans.add(top.val);
            if (top.right != null) st.push(top.right);
            if (top.left != null) st.push(top.left);
        }
        return ans;
    }
}
