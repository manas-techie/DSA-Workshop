package BinaryTree;


import java.util.Scanner;

public class NthOrderElements {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        // nth level element

//        System.out.print("Enter the level: ");
//        n = sc.nextInt();
//        nthOrderElements(a,0);


        // Breath first search using DFS

        BFS(a);
    }

    // Using DFS
    private static void nthOrderElements(TreeNode root, int level) {
        if (root == null) return;
        if(level > n) return;
        if (level == n) System.out.print(root.val + " ");
        nthOrderElements(root.left, level + 1);
        nthOrderElements(root.right, level + 1);
    }

    // BFS using DFS without using Queue
    private static void BFS(TreeNode root) {
        int level = getTheLevel(root);
        for (int i = 0; i <= level; i++) {
            n = i;
            nthOrderElements(root, 0);
            System.out.println();
        }
    }

    public static int getTheLevel(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getTheLevel(root.left), getTheLevel(root.right));
    }
}
