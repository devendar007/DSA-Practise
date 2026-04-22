class Solution {
    TreeNode prev=null;
    boolean flag=true;
    public void helper(TreeNode root){
        if(root==null) return ;
        helper(root.left);
        if(prev!=null){
            if(prev.val>=root.val) {
                flag=false;
                return;
            }
        }
        prev=root;
        helper(root.right);
    }
    public boolean isValidBST(TreeNode root) {
 helper(root);
   return flag;
    }
}
