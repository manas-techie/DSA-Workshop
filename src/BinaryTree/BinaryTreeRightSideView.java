package BinaryTree;

import java.util.*;

//Leetcode 199
class BinaryTreeRightSideView {
    public static int level(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }

    public static void BFS(TreeNode root, int level, List<Integer> ans) {
        if (root == null) return;
        ans.set(level, root.val);
        BFS(root.left, level + 1, ans);
        BFS(root.right, level + 1, ans);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        int n = level(root);
        List<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        BFS(root, 0, ans);
        return ans;
    }

    public static void main(String[] args) {

    }
}
