class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
       q.add(root);
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        while(q.size()!=0){
         int n=q.size();
         List<Integer> temp=new ArrayList<>();
         for(int i=0;i<n;i++){
         TreeNode node=q.poll();
         temp.add(node.val);
         if(node.left!=null) q.add(node.left);
         if(node.right!=null) q.add(node.right);
         }
         ans.add(temp);
        }
        return ans;
    }
}
