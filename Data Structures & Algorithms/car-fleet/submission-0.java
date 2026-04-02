class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         int car[][]=new int[position.length][2];
        for(int i=0;i<position.length;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car,(a,b)->Integer.compare(b[0],a[0]));
        Stack<Double> st=new Stack<>();
        for(int c[]:car){
          st.push((double)(target-c[0])/c[1]);
          if(st.size()>=2&&st.peek()<=st.get(st.size()-2)){
            st.pop();
          }
        }
return st.size();
    }
}
