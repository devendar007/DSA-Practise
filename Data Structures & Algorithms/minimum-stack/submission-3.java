class MinStack {
   Stack<Integer> min=new Stack<>();
   Stack<Integer> st=new Stack<>(); 
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(min.size()==0||val<=min.peek()) min.push(val);
    }
    
    public void pop() {
        int x=st.pop();
        if(x==min.peek()) min.pop();
    }
    
    public int top() {
    return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
