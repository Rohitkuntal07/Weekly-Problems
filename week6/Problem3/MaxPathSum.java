class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class MaxPathSumBinaryTree {
    static int maxSum;

    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }

    private static int helper(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(helper(node.left), 0);
        int right = Math.max(helper(node.right), 0);
        int current = node.val + left + right;
        maxSum = Math.max(maxSum, current);
        return node.val + Math.max(left, right);
    }
