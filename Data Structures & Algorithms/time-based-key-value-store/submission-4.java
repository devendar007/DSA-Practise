class TimeMap {
   Map<String,HashMap<Integer,String>> mp;
    public TimeMap() {
        mp=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mp.containsKey(key)){
            mp.put(key,new HashMap<>());
        }
    mp.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        int max=0;
       HashMap<Integer,String> et=mp.get(key);
       if(et==null) return "";
       for(Map.Entry<Integer,String> entry:et.entrySet()){
        if(timestamp>=entry.getKey()){
            max=Math.max(max,entry.getKey());
        }
       }
       return et.get(max)==null?"":et.get(max);
    }
}
