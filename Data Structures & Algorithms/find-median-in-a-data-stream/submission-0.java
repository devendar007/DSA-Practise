class MedianFinder {
    //false->odd true->even //odd will be on max
    //true. in maxPriorityQueue where min value are going to store
    PriorityQueue<Integer> min=new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer> max=new PriorityQueue<>();
    boolean flag=true;
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(flag==true){
        min.add(num);
        max.add(min.poll());
        flag=false;
        }
        else{
            max.add(num);
            min.add(max.poll());
            flag=true;
        }
    }
    
    public double findMedian() { 
        if(flag==false) return max.peek()*1.0;
        else return (max.peek()+min.peek())/2.0;
        
    }
}
