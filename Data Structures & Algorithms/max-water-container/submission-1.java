class Solution {
    public int maxArea(int[] heights) {
        int i=0;
         int j=heights.length-1;
         int max=0;
         while(i<j){
            int left=heights[i];
            int right=heights[j];
              max=Math.max(max,Math.abs(i-j)*Math.min(left,right));
            if(left<=right){
                i++;
            }
            else j--;
         }
         return max;
    }
}
