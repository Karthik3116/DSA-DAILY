class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character , Character> opening = new HashMap<>();
        opening.put(')','(');
        opening.put(']','[');
        opening.put('}','{');
    
            
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i)== '{'){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty() || opening.get(s.charAt(i)) != st.peek()){
                    return false;
                }
                
                st.pop();
            }
        }
        return st.isEmpty();
       
    }
}