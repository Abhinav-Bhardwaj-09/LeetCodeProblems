package N_aryTreePreOrderTraversal;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 27/02/23
 * Time: 11:26
 */

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> preOderArr = new ArrayList<>();

        preOrderRecursive(root, preOderArr);

        return preOderArr;
    }

    public void preOrderRecursive(Node root, List<Integer> res){     // method for calling recursively
        if(root == null){   // base condition
            return;
        }

        res.add(root.val);

        for(Node childNode : root.children){
            preOrderRecursive(childNode, res);
        }
    }
}
