class Solution {

public int helper(TreeNode root){
    if(root==null) return 0;
    int leftMax=1+helper(root.left);
    int rightMax=1+helper(root.right);
    return Math.max(leftMax,rightMax);

}
    public int maxDepth(TreeNode root) {
       
        return helper(root);
    }
}
