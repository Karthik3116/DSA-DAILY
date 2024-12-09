
public class Solution {
    public boolean valid(String s) {
        int open = 0;
        for (char c : s.toCharArray()) {
            open += c == '(' ? 1 : -1;
            if (open < 0) return false;
        }
        return open == 0;
    }

    void dfs(String s, List<String> res, int n) {
        if (n * 2 == s.length()) {
            if (valid(s)) res.add(s);
            return;
        }
        dfs(s + '(', res, n);
        dfs(s + ')', res, n);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs("", res, n);
        return res;
    }
}


// class Solution {
//     // public static boolean check(String s) {
//     //     Stack<Character> stack = new Stack<>();
//     //     for (char c : s.toCharArray()) {
//     //         if (c == '(' || c == '[' || c == '{') {
//     //             stack.push(c);
//     //         } else {
//     //             if (stack.isEmpty()) {
//     //                 return false;
//     //             }
//     //             char top = stack.pop();
//     //             if ((c == ')' && top != '(') || 
//     //                 (c == ']' && top != '[') || 
//     //                 (c == '}' && top != '{')) {
//     //                 return false;
//     //             }
//     //         }
//     //     }
//     //     return stack.isEmpty();
//     // }


//     // public List<String> print(String output , int inputlen ,List<String> ans){
//     //     if(output.length() == inputlen){

//     //         if(check(output)){
//     //             ans.add(output);
//     //             System.out.println(output);
//     //         }
//     //         return ans;
//     //     }

//     //     print(output + "(" , inputlen ,ans);
//     //     print(output + ")" , inputlen, ans);
//     //     return ans;
        
//     // }

//     public List<String> solve(List<String> ans , int open , int close , int total , String output){
//         if(open+close == total && open == total/2 && close == total/2){
//             ans.add(output);
//             return ans;
//         }

     

//         if(open < total/2){
//             solve(ans , open + 1, close , total , output + "(");
//         }
//         if(close < open){
//             solve(ans , open  , close + 1 , total , output + ")");
//         }
        

//         return ans;
//     }
    
//     public List<String> generateParenthesis(int n) {
//         List<String> ans = new ArrayList<>();
//         // ans = print(new String("") , 2*n, ans);
//         ans = solve(ans , 1,0,n*2 , new String("(")); 
//         return ans;
//     }
// }