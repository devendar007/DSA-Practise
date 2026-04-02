class Solution {
    public int helper(TreeNode root,List<Boolean> ans){
        if(root==null) return 0;
        int left=helper(root.left,ans);
        int right=helper(root.right,ans);
        if(Math.abs(left-right)>1) {
        ans.set(0,false);
        }
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
     
        List<Boolean> b=new ArrayList<>();
        b.add(true);
        helper(root,b);
       return b.get(0);
    }
}
