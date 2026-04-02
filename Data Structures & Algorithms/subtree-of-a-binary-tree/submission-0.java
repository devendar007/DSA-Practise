class Solution {
    public boolean helper(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return helper(p.left,q.left)&&helper(p.right,q.right);
    }  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        boolean ans=helper(root,subRoot);
        return ans||isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);

    }
}
