class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        int size=0;
        while(q.size()!=0){
            int n=q.size();
            for(int i=0;i<n;i++){
               TreeNode node= q.poll();
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
            }
            size++;
        }
        return size;
    }
}
