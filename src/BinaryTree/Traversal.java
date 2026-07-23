package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //a is root
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;

        System.out.print("Preorder: ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(a);
        System.out.println();
        System.out.print("BFS: ");
        levelOrder(a);
        System.out.println();
        System.out.println("BFS using queue: ");
        BFS(a);
    }

    private static void preorder(TreeNode root) {
        if (root == null) return; //Base case
        System.out.print(root.val + " ");
        preorder(root.left); //Left Subtree
        preorder(root.right); //Right Subtree
    }

    private static void inorder(TreeNode root) {
        if (root == null) return; //Base case
        inorder(root.left); //Left Subtree
        System.out.print(root.val + " ");
        inorder(root.right); //Right Subtree
    }

    private static void postorder(TreeNode root) {
        if (root == null) return; //Base case
        postorder(root.left); //Left Subtree
        postorder(root.right); //Right Subtree
        System.out.print(root.val + " ");
    }

    // BFS (left -> Right)
    private static void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (q.size() > 0) {
            TreeNode front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }

    //BFS using Queue -- differ the levels
    public static void BFS(TreeNode root) {
        int preLvl = 0;
        Queue<Pair> q = new LinkedList<>();
        Pair p = new Pair(root, 0);
        q.add(p);
        while (!q.isEmpty()) {
            Pair front = q.remove();
            TreeNode node = front.node;
            int lvl = front.level;
            if (lvl != preLvl) {
                System.out.println();
                preLvl++;
            }
            System.out.print(node.val + " ");
            if (node.left != null) q.add(new Pair(node.left, lvl + 1));
            if (node.right != null) q.add(new Pair(node.right, lvl + 1));
        }
    }

    //make a pair class
    static class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode node, int lvl) {
            this.node = node;
            this.level = lvl;
        }
    }
}
