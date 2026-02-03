package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

// Created by Abhinav Bhardwaj on 03/02/2026 18:39 using IntelliJ IDEA


public class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();

    inOrderTraverse(root, result);
    return result;
  }

  private void inOrderTraverse(TreeNode node, List<Integer> result) {
    if (node == null) {
      return;
    }

    inOrderTraverse(node.left, result);
    result.add(node.val);
    inOrderTraverse(node.right, result);
  }
}
