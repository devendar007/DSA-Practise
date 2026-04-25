class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)->b-a);
        int freq[]=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        for(int it:freq) {
            if(it>0) pq.add(it);
        }
        int time=0;
        while(pq.size()!=0){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(pq.size()!=0){
                    int num=pq.poll();
                    num--;
                   temp.add(num);
                }
            }
            for(int it:temp) if(it>0)pq.add(it);
            if(pq.size()==0) time+=temp.size();
            else time+=n+1;
        }
        return time;
    }
}
