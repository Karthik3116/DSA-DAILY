class Solution {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public List<String> print(String output , int inputlen ,List<String> ans){
        if(output.length() == inputlen){

            if(check(output)){
                ans.add(output);
                // System.out.println(output);
            }
            return ans;
        }

        print(output + "(" , inputlen ,ans);
        print(output + ")" , inputlen, ans);
        return ans;
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        ans = print(new String("") , 2*n, ans);
        return ans;
    }
}