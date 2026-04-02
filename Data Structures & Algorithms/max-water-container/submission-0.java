class Solution {
    public int maxArea(int[] heights) {
     int i=0;
     int j=heights.length-1;
     int max=0;
     while(i<j){
    int h1=heights[i];
    int h2=heights[j];
    max=Math.max(max,(j-i)*Math.min(h1,h2));
    if(h1>h2){
        j--;
    }
    else i++;
     }  
    return max;
    }
}
