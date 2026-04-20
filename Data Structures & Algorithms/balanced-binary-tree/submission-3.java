class Solution {
    boolean flag=true;
    public int helper(TreeNode root){
             if(root==null) return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        int diff=Math.abs(left-right);
        if(diff>1) {
            flag=false;
            return 0;
        }
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
      helper(root);
      return flag;
    }
}
