class Solution {
    int max=0;
    public int helper(TreeNode root){
        if(root==null) return 0;
        int leftMax=helper(root.left);
        int rightMax=helper(root.right);
        max=Math.max(1+leftMax+rightMax,max);
        return 1+Math.max(leftMax,rightMax);
    }
    public int maxDepth(TreeNode root) {
        // if(root==null) return 0;
        // helper(root);
        // return max-1;
        if(root==null) return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        return 1+Math.max(left,right);

    }
}
