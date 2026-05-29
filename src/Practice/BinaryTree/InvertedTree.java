package Practice.BinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    //    Traversing in a Binary Tree
    void display(TreeNode root) { // Pre-Order
        if (root == null) return; //Base case
        System.out.print(root.val + " ");
        display(root.left); //Left Subtree
        display(root.right); //Right Subtree
    }
}

public class InvertedTree{
    public static void main(String[] args) {
        //    4,2,7,1,3,6,9
        TreeNode a = new TreeNode(4); //root
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        invertTree(a);
        a.display(a);

    }
//    Leetcode 226
//    Time Complexity O(N), Auxiliary Space O(H) & Space Coplexity O(N), Where N is no of Nodes in tree and H is height of the tree
    public static TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
    public static void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        helper(root.right);
        //swap funcatinality
        swap(root);
        //TreeNode temp = root.left;
        //root.left = root.right;
        //root.right = temp;
    }
    public static void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}

