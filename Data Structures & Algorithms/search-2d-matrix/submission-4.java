class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for col num%col.size for row num/row.size
        int st=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int end =m*n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            else if(matrix[mid/m][mid%m]<target) st=mid+1;
            else end=mid-1;
        }
        return false;
    }
}
