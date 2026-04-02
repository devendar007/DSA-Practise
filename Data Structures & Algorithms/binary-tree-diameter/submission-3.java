class Solution {
    public int helper(TreeNode root,List<Integer> ans){
        if(root==null) return 0;
        int left=helper(root.left,ans);
        int  right=helper(root.right,ans);
        ans.set(0,Math.max(ans.get(0),left+right));
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
    List<Integer> ans=new ArrayList<>();
    ans.add(0);
  helper(root,ans);
  return ans.get(0);
    }
}
