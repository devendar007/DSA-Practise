class Solution {
    public int[] dailyTemperatures(int[] t) {
        int ans[]=new int[t.length];
        Stack<Integer> st=new Stack<>();
        for(int i=t.length-1;i>=0;i--){
        while(st.size()>0&&t[st.peek()]<=t[i]){
            st.pop();
        }
        if(st.size()==0) ans[i]=0;
        else ans[i]=st.peek()-i;
        st.add(i);
        }
        return ans;
    }
}
