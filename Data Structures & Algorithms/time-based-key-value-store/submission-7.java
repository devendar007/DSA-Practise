class Pair{
    int ts;
    String value;
    Pair(int ts,String value){
        this.ts=ts;
        this.value=value;
    }
}
class TimeMap {
  HashMap<String,List<Pair>> mp=new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mp.containsKey(key)) mp.put(key,new ArrayList<>());
        mp.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> pair=mp.get(key);
        if(!mp.containsKey(key)) return "";
        int st=0;
        int end=pair.size()-1;
        String ans="";
        while(st<=end){
            int mid=st+(end-st)/2;
            if(pair.get(mid).ts==timestamp) return pair.get(mid).value;
            else if(pair.get(mid).ts<timestamp){
         ans=pair.get(mid).value;
         st=mid+1;
            }
            else end=mid-1;
        }
        return ans;
    }
    
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */