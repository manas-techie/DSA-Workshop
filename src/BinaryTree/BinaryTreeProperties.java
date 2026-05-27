package BinaryTree;


import com.sun.source.tree.Tree;

public class BinaryTreeProperties {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //a is root
        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        System.out.println("Sum of all the nodes in tree: " + sumOfNodes(a));
        System.out.println("Product of all the nodes in tree: " + productOfTreeNodes(a));
        System.out.println("Product of all Non-zero nodes in tree: " + productOfNonZeroNodes(a));
        System.out.println("Maximum valued Node in the tree: " + nodeWithMaxValue(a));
        TreeNode node = getMaxValue(a);
        System.out.println("Maximum valued Node in the tree: " + node.val);
        System.out.println("Minimum valued Node in the tree: " + getMinimumValuedNode(a));
        System.out.println("The Size of the tree: " + getTheSize(a));
        System.out.println("The Level of the tree: " + getTheLevel(a));
        System.out.println("The height of the tree: " + (getTheLevel(a) - 1));
    }

    // Sum of the all nodes in the tree
    // Time Complexity O(N) , Space Complexity O(H) where N is the no of nodes in tree and H is th height of the tree
    public static int sumOfNodes(TreeNode root) {
        if (root == null) return 0;
//        int sum = root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
        int sumOfLeftSubTree = sumOfNodes(root.left), sumOfRightSubTree = sumOfNodes(root.right);
        int sum = root.val + sumOfLeftSubTree + sumOfRightSubTree;
        return sum;
    }

    // Products of all the tree nodes
    // Time Complexity O(N) , Space Complexity O(H) where N is the no of nodes in tree and H is th height of the tree
    public static int productOfTreeNodes(TreeNode root) {
        if (root == null) return 1;
        return root.val * productOfTreeNodes(root.left) * productOfTreeNodes(root.right);
    }

    //Product of non-zero nodes in tree
    public static int productOfNonZeroNodes(TreeNode root) {
        if (root == null) return 1;
        if (root.val != 0) {
            return root.val * productOfNonZeroNodes(root.left) * productOfNonZeroNodes(root.right);
        }
        return productOfNonZeroNodes(root.left) * productOfNonZeroNodes(root.right);
    }

    // Find the node with max value
    // Time Complexity O(N) , Space Complexity O(H) where N is the no of nodes in tree and H is th height of the tree
    public static int nodeWithMaxValue(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        int maxValueOfLeftSubtree = nodeWithMaxValue(root.left), maxValueOfRightSubTree = nodeWithMaxValue(root.right);
        int maxElement = Math.max(root.val, Math.max(maxValueOfLeftSubtree, maxValueOfRightSubTree));
        return maxElement;
    }

    // This is a anti-pattern because where the memory is wasted due to the new TreeNode(Integer.MIN_VALUE)
//    public static TreeNode getMaxValue(TreeNode root) {
//        if (root == null) return new TreeNode(Integer.MIN_VALUE);
//        TreeNode maxNodeOfLeftSubtree = getMaxValue(root.left), maxNodeOfRightSubTree = getMaxValue(root.right);
//        int maxElement = Math.max(root.val, Math.max(maxNodeOfLeftSubtree.val, maxNodeOfRightSubTree.val));
//        if (maxElement == maxNodeOfLeftSubtree.val) return maxNodeOfLeftSubtree;
//        if (maxElement == maxNodeOfRightSubTree.val) return maxNodeOfRightSubTree;
//        return root;
//    }

    //    optimal Approach
// Time Complexity O(N) , Space Complexity O(H) where N is the no of nodes in tree and H is th height of the tree
    public static TreeNode getMaxValue(TreeNode root) {
        if (root == null) return null; // base case

//        Traverse left and right
        TreeNode leftMaxNode = getMaxValue(root.left);
        TreeNode rightMaxNode = getMaxValue(root.right);

//        Assume root as the max node
        TreeNode maxNode = root;

        if (leftMaxNode != null && leftMaxNode.val > maxNode.val) {
            maxNode = leftMaxNode;
        }
        if (rightMaxNode != null && rightMaxNode.val > maxNode.val) {
            maxNode = rightMaxNode;
        }

        return maxNode;

    }

    // Node with Minimum value
    public static int getMinimumValuedNode(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        int leftSubTreeMinValue = getMinimumValuedNode(root.left), rightSubTreeMinValue = getMinimumValuedNode(root.right);
        return Math.min(root.val, Math.min(leftSubTreeMinValue, rightSubTreeMinValue));
    }

    // Find the Size of Binary Tree
    public static int getTheSize(TreeNode root) {
        if (root == null) return 0;
        return 1 + getTheSize(root.left) + getTheSize(root.right);
    }

    //Find the level of the Binary Tree
    public static int getTheLevel(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getTheLevel(root.left), getTheLevel(root.right));
    }
}
