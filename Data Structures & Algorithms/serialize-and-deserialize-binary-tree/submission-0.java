public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList();
        if(root==null) return ",";
        q.add(root);
        sb.append(root.val).append(",");
        while(q.size()!=0){
        TreeNode node=q.poll();
        if(node.left!=null){
            q.add(node.left);
            sb.append(node.left.val).append(",");
        }
        else if(node.left==null){
            sb.append("null").append(",");
        }
        if(node.right!=null){
            q.add(node.right);
            sb.append(node.right.val).append(",");
        }
        else if(node.right==null){
            sb.append("null").append(",");
        }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        if(arr.length==0||arr[0].equals("null")) return null;
        TreeNode root =new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        int i=1;
      while(i<arr.length&&q.size()!=0){
      TreeNode node=q.poll();
      if(!arr[i].equals("null")){
       node.left=new TreeNode(Integer.parseInt(arr[i]));
      q.add(node.left);
      }
      i++;
       if(!arr[i].equals("null")){
       node.right=new TreeNode(Integer.parseInt(arr[i]));
      q.add(node.right);
      }
      i++;

      }
      return root;
        
    }
}
