class Solution {
    public void helper(int idx,int arr[],int x,List<List<Integer>> ans,List<Integer> ds){
        if(x==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
         if(idx==arr.length||x<0){
            
            return;
         }
         for(int i=idx;i<arr.length;i++){
            if(i!=idx&&arr[i]==arr[i-1]) continue;
            if(arr[i]<=x){
                ds.add(arr[i]);
                helper(i+1,arr,x-arr[i],ans,ds);
               ds.remove(ds.size()-1);
            }
            
         }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
   Arrays.sort(candidates);
   List<List<Integer>> ans=new ArrayList<>();
   helper(0,candidates,target,ans,new ArrayList<>());
   return ans;     
   

    }
}
