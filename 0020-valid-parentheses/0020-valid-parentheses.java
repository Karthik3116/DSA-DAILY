class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

        
       
        
        for(char bracket : s.toCharArray()){
            if(bracket == '[' || bracket == '(' || bracket == '{'){
                System.out.println("pushed" + bracket);
                st.push(bracket);
            }
            else{
                if(st.isEmpty()){
                    // System.out.println("ohooo1");
                    return false;
                }
                else if((bracket == ']' && st.peek() == '[') || (bracket == '}' && st.peek() == '{') || (bracket == ')' && st.peek() == '(')){
                    System.out.println("popped" + st.peek());
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }

        return st.isEmpty();

    }
}