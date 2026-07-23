package BinaryTree;

import java.util.*;

//Leetcode 102
public class BinaryTreeLevelOrderTraversal {
    //    Method 1 -> using DFS and iterative method
    public int level(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }

    public void elementInNthLevel(TreeNode root, int level, int lvl, List<Integer> arr) {
        if (root == null) return;
        if (level > lvl) return;
        if (level == lvl) arr.add(root.val);
        elementInNthLevel(root.left, level + 1, lvl, arr);
        elementInNthLevel(root.right, level + 1, lvl, arr);
    }

//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        int level = level(root);
//        for (int i = 0; i < level; i++) {
//            List<Integer> arr = new ArrayList<>();
//            elementInNthLevel(root, 0, i, arr);
//            ans.add(arr);
//        }
//        return ans;
//    }

    // Method 2 - using Queue
    public void BFS(TreeNode root, List<List<Integer>> ans) {
        Queue<Pair> q = new LinkedList<>();
        if (root != null) {
            q.add(new Pair(root, 0));
        }
        while (!q.isEmpty()) {
            Pair front = q.remove();
            TreeNode node = front.node;
            int lvl = front.level;

            ans.get(lvl).add(node.val);

            if (node.left != null) q.add(new Pair(node.left, lvl + 1));
            if (node.right != null) q.add(new Pair(node.right, lvl + 1));
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int level = level(root);
        for (int i = 1; i <= level; i++) {
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }
        BFS(root, ans);
        return ans;
    }

    class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int lvl) {
            this.node = node;
            this.level = lvl;
        }
    }
}
