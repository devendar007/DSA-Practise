class Solution {
    int ans=-1;
    int count=0;
    public void helper(TreeNode root,int k){
        if(root==null) return;
        helper(root.left,k);
        count++;
        if(count==k){       
        ans=root.val;
         System.out.println(ans);
         return;
        }
        helper(root.right,k);

    }
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;
    }
}
