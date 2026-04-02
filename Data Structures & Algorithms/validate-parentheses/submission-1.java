class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.add(s.charAt(i));
            }
            else if(st.size()>0&&s.charAt(i)==')'){
                if(st.peek()!='(') return false;
                st.pop();
            }
            else if(st.size()>0&&s.charAt(i)=='}'){
                if(st.peek()!='{') return false;
                st.pop();
            }
            else if(st.size()>0&&s.charAt(i)==']'){
                if(st.peek()!='[') return false;
                st.pop();
            }
            else return false;
        }
        return st.size()>0?false:true;
    }
}
