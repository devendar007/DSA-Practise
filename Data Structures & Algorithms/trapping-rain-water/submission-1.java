class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int nge[]=new int[n];
        int pge[]=new int[n];
        Stack<Integer> st=new Stack<>();
        nge[n-1]=height[n-1];
        int max=nge[n-1];
        for(int i=n-2;i>=0;i--){
         nge[i]=Math.max(max,height[i]);
         max=Math.max(max,height[i]);
        }
        pge[0]=height[0];
        max=height[0];
        for(int i=1;i<n;i++){
         pge[i]=Math.max(max,height[i]);
         max=Math.max(max,height[i]);
        }

        int total=0;
        for(int i=1;i<n-1;i++){
         total+=Math.min(pge[i],nge[i])-height[i];
         System.out.println(Math.min(pge[i],pge[i])-height[i]+" "+pge[i]+" "+nge[i]);
        }
        return total;

    }
}
