class pair{
String word;
int count;
pair(String word,int count){
    this.word=word;
    this.count=count;


}
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.count,b.count));
      Set<String> isVis=new HashSet<>();
      pq.add(new pair(beginWord,1));
      isVis.add(beginWord);
      while(pq.size()!=0){
        pair p=pq.poll();
        String word=p.word;
        int count=p.count;
        if(word.equals(endWord)) return count;
        for(int i=0;i<word.length();i++){
        for(char ch='a';ch<='z';ch++){
            char arr[]=word.toCharArray();
            arr[i]=ch;
            String t=new String(arr);
            if(wordList.contains(t)&&!isVis.contains(t)){
                isVis.add(t);
                pq.add(new pair(t,count+1));
            }
        }}
      }
      return 0;
    }
}
