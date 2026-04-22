class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        if(root==null) return ans;
        while(q.size()!=0){
            int n=q.size();
            int val=-1;
            for(int i=0;i<n;i++){
              TreeNode node=q.poll();
              val=node.val;
              if(node.left!=null) q.add(node.left);
              if(node.right!=null) q.add(node.right);
            }
            ans.add(val);
        }
        return ans;
    }
}
