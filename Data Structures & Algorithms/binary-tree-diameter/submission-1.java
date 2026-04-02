class Solution {
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left=1+helper(root.left);
        int right=1+helper(root.right);
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int max=0;
        max=Math.max(max,helper(root.left)+helper(root.right));
        max=Math.max(max,diameterOfBinaryTree(root.left));
        max=Math.max(max,diameterOfBinaryTree(root.right));
        return max;

    }
}
