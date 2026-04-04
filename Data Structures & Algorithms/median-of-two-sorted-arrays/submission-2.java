class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        int st=0;
        int end=n1;
        
        while(st<=end){
            int px=st+(end-st)/2;
            int py=(n1+n2+1)/2-px;
            int x1=(px==0)?Integer.MIN_VALUE:nums1[px-1];
            int x2=(px==n1)?Integer.MAX_VALUE:nums1[px];
            int x3=(py==0)?Integer.MIN_VALUE:nums2[py-1];
            int x4=(py==n2)?Integer.MAX_VALUE:nums2[py];
            if(x1<=x4&&x2>=x3){
                if((n1+n2)%2==0){
             return (Math.max(x1,x3)+Math.min(x2,x4))/2.0;
                }
                else{
                return Math.max(x1,x3)*1.0;
                }
            }
            else if(x1>x4){
                end=px-1;

            }else{
                st=px+1;
            }


        }
        return 1.0;

    }
}
