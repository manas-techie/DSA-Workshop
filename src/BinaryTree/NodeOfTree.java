package BinaryTree;


class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}

public class NodeOfTree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //a is root
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        System.out.println(a.val); //1
        System.out.println(a.left.val); //2
        System.out.println(a.left.left.val); //4
        System.out.println(a.left.right.val); //5
        System.out.println(a.left.right.right); //5 -> null

        display(a);


    }

    //    Traversing in a Binary Tree
    private static void display(TreeNode root) {
        if (root == null) return; //Base case
        System.out.print(root.val + " ");
        display(root.left); //Left Subtree
        display(root.right); //Right Subtree
    }
}
