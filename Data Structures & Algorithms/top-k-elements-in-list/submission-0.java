class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     List<Integer> ans[]=new ArrayList[nums.length+1];
     Map<Integer,Integer> mp=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
     }
     for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
         if(ans[entry.getValue()]==null){
            ans[entry.getValue()]=new ArrayList<>();
         }
        ans[entry.getValue()].add(entry.getKey());
     }
     int ans2[]=new int[k];
     int j=0;
     for(int i=ans.length-1;i>=0&&j<k;i--){
        List<Integer> temp=ans[i];
        if(temp!=null){
        for(int it:temp){
            if(j>=k) break;
            ans2[j++]=it;
        }}
     }
     return ans2;
    }
}
