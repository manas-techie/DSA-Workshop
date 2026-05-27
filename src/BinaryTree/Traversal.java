package BinaryTree;

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
}
