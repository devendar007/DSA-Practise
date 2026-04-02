class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        st.add(n-1);
        int ans[]=new int[n];
        ans[n-1]=0;
        int j=n-2;
        while(j>=0&&st.size()!=0){
            while(st.size()>0&&temperatures[st.peek()]<=temperatures[j]){
                st.pop();
            }
            if(st.size()==0) ans[j]=0;
            else ans[j]=st.peek()-j;
            st.push(j);
            j--;
        }
        return ans;
    }
}
