package MaximumDepthOfBinaryTree;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 26/02/23
 * Time: 14:02
 */


public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftNode = maxDepth(root.left);
        int rightNode = maxDepth(root.right);

        return Math.max(leftNode, rightNode) + 1;
    }
}
