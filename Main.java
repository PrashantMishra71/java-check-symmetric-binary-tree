public class Main {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean isMirror(TreeNode left, TreeNode right) {

        // Both nodes are null
        if (left == null && right == null) {
            return true;
        }

        // One node is null
        if (left == null || right == null) {
            return false;
        }

        // Values are different
        if (left.data != right.data) {
            return false;
        }

        // Compare opposite sides
        return isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

    public static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(3);

        if (isSymmetric(root)) {
            System.out.println("The tree is symmetric");
        } else {
            System.out.println("The tree is not symmetric");
        }
    }
}