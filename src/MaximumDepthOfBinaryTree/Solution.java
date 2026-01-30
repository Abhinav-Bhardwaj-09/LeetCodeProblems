package MaximumDepthOfBinaryTree;

// Created by Abhinav Bhardwaj on 26/02/2023 14:02 using IntelliJ IDEA

public class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;

    int leftNode = maxDepth(root.left);
    int rightNode = maxDepth(root.right);

    return Math.max(leftNode, rightNode) + 1;
  }
}
