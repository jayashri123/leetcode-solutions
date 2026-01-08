**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stk  = new Stack<>();
        List<Integer> list = new ArrayList<>();
       
        while(true) {
            
            if(root != null) {
                stk.push(root);
                root = root.left;
            }else {
                if(stk.isEmpty())
                    break;
                root = stk.pop();
                list.add(root.val);
                
                root =root.right;
            }
        }
        return list;
    }
    void inorderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}
