class Solution {
    int max=0;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int leftMax=helper(root.left);
        int rightMax=helper(root.right);
        max=Math.max(max,1+leftMax+rightMax);
        return 1+Math.max(leftMax,rightMax);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        helper(root);
        return max-1;
    }
}
