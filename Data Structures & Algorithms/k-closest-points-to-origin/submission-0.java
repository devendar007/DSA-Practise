class Tuple{
    int r;
    int c;
    Double dist;
    Tuple(int r,int c,Double dist){
        this.r=r;
        this.c=c;
        this.dist=dist;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
PriorityQueue<Tuple> pq = new PriorityQueue<>(
    (a, b) -> Double.compare(a.dist, b.dist)
);
        for(int it[]:points){
            double dist=Math.sqrt((it[0]*it[0])+(it[1]*it[1]));
            pq.add(new Tuple(it[0],it[1],dist));
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            Tuple t=pq.poll();
            ans[i][0]=t.r;
            ans[i][1]=t.c;

        }
        return ans;

    }
}
