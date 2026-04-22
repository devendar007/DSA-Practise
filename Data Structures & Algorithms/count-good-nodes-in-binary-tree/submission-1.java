class Solution {
    int count=0;
    public void helper(TreeNode root,int max){
       if(root==null) return ; 
        if(root.val>=max) {
        count++;
        max=root.val;
        }
        System.out.println(max);
        helper(root.left,max);
        helper(root.right,max);
       
    }
    public int goodNodes(TreeNode root) {
        helper(root,Integer.MIN_VALUE);
        return count;
    }
}
