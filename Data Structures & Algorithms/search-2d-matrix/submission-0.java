class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int st=0;
        int end=n*m-1;
        while(st<=end){
         int mid=st+(end-st)/2;
         int val=matrix[mid/m][mid%m];
         if(val==target) return true;
         if(val>target){
            end=mid-1;
         }
         else st=mid+1;

        }
        return false;
    }
}
