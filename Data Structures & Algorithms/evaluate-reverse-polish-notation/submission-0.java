class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String ch : tokens) {
            if (ch.equals("*") || ch.equals("+") || ch.equals("/") || ch.equals("-")) {
                int n1 = st.pop();
                int n2 = st.pop();
                if (ch.equals("*")) {
                    st.push(n2 * n1);
                } else if (ch.equals("-")) {
                    st.push(n2 - n1);
                } else if (ch.equals("/")) {
                    st.push(n2 / n1);
                } else if (ch.equals("+")) {
                    st.push(n2 + n1);
                }
            } else {
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}
