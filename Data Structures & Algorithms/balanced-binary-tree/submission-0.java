class Solution {
    public int helper(TreeNode root){
if(root==null) return 0;
   int left=1+helper(root.left);
   int right=1+helper(root.right);
   return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=helper(root.left);
        int right=helper(root.right);
        int diff=Math.abs(left-right);
        if(diff>1) return false;
        if(!isBalanced(root.left)) return false;
        if(!isBalanced(root.right)) return false;
        return true;
    }
}
