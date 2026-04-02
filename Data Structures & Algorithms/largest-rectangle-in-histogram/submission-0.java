class Solution {
    public int largestRectangleArea(int[] heights) {
      int n=heights.length;
      int nse[]=new int[n];
      int pse[]=new int[n];
      Stack<Integer> st=new Stack<>();
      nse[n-1]=n;
       st.add(n-1);
      for(int i=n-2;i>=0;i--){
        while(st.size()>0&&heights[st.peek()]>=heights[i]){
        st.pop();
        }
        if(st.size()!=0) nse[i]=st.peek();
        else nse[i]=n;
        st.add(i);
      }
      while(st.size()!=0) st.pop();
      pse[0]=-1;
      st.add(0);
      for(int i=1;i<n;i++){
        while(st.size()>0&&heights[st.peek()]>=heights[i]) st.pop();
         if(st.size()!=0) pse[i]=st.peek();
        else pse[i]=-1;
        st.add(i);
      }
      int max=0;
      for(int i=0;i<n;i++){
        max=Math.max(max,heights[i]*(nse[i]-pse[i]-1));
      }
      return max;
    }
}
