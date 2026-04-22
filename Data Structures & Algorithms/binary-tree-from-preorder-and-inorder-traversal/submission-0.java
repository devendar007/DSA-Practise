class Solution {
    public TreeNode helper(int pre[],int in[],int st,int end,List<Integer> idx,Map<Integer,Integer> mp){
        if(st>end) return null;
        int i=mp.get(pre[idx.get(0)]);
        idx.set(0,idx.get(0)+1);
        TreeNode root=new TreeNode(in[i]);
        root.left=helper(pre,in,st,i-1,idx,mp);
        root.right=helper(pre,in,i+1,end,idx,mp);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++) mp.put(inorder[i],i);
        List<Integer> idx=new ArrayList<>();
        idx.add(0);
        return helper(preorder,inorder,0,inorder.length-1,idx,mp);
    }
}