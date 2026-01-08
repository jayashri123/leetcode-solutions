class Solution {
    int max =0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfBinaryTree(root);
        return max;
       
    }
    
        public int heightOfBinaryTree(TreeNode root){
        if(root == null) return 0;
        int lh = heightOfBinaryTree(root.left);
        int rh = heightOfBinaryTree(root.right);
        max = Math.max(max,lh+rh); 
        return 1+Math.max(lh,rh);
    }
   
}
