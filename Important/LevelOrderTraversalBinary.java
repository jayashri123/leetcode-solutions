

class LevelOrderTraversalBinaryTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outputList = new ArrayList<>();
        levelOrderTraverseUsingDepth(root, outputList, 0);
        return outputList;
    }
    void levelOrderTraverseUsingDepth(TreeNode node,  List<List<Integer>> outputList, int level){
        if(node == null) {
            return;
        }
        if(outputList.size() == level) {
            outputList.add(new ArrayList<>());
        }
        outputList.get(level).add(node.val);
        levelOrderTraverseUsingDepth(node.left, outputList, level+1);
        levelOrderTraverseUsingDepth(node.right, outputList, level+1);
        return;
    }
}
