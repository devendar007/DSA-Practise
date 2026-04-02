class Solution {
    public TreeNode helper(TreeNode root){
        if(root==null) return null;
       
       TreeNode left= helper(root.left);
       TreeNode right= helper(root.right);
       root.left=right;
       root.right=left;
       return root;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        return helper(root);
    }
}
