class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int j=0;
        for(int i=0;i<n;i++){
          while(dq.size()>0&&dq.peekFirst()<=(i-k)){
            dq.pollFirst();
          }
          while(dq.size()>0&&nums[i]>=nums[dq.peekLast()]){
            dq.pollLast();
          }
          dq.addLast(i);
          if(i>=k-1)   ans[j++]=nums[dq.peekFirst()];
        }
        return ans;
    }
}
