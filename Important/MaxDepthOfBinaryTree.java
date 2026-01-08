class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return calculateMaxDepth(root, 0);

    }
    public int calculateMaxDepth(TreeNode root, int count) {
        if(root == null) {
            return count;

        }
        int a = calculateMaxDepth(root.left, count+1);
        int b = calculateMaxDepth(root.right, count+1);
        return Math.max(a,b);
        
    }
}
