class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int val) { this.val = val; }
}

class Solution {
  private int ans = 0;

  public int countUnivalSubtrees(TreeNode root) {
    isUnival(root, Integer.MAX_VALUE);
    return ans;
  }

  private boolean isUnival(TreeNode root, int val) {
    if (root == null)
      return true;

    boolean left = isUnival(root.left, root.val);
    boolean right = isUnival(root.right, root.val);

    if (left && right) {
      ans++;
      return root.val == val;
    }

    return false;
  }
}
