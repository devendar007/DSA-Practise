
class Solution {  
    public boolean check(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
      if(p.val!=q.val) return false;
      return check(p.left,q.left)&&check(p.right,q.right);
    }
    public boolean helper(TreeNode root,TreeNode sub){
        if(root==null) return false;
        if(root.val==sub.val){
         boolean flag=check(root,sub);
         if(flag) return true;
        }
        return helper(root.left,sub)||helper(root.right,sub);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
   return helper(root,subRoot);
    }
}
