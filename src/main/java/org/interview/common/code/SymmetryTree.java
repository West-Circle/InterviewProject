package org.interview.common.code;

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class SymmetryTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if ((left != null && right == null) || (left == null && right != null)) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        } else {
            return dfs(left.left, right.right) && dfs(left.right, right.left);
        }
    }
}


