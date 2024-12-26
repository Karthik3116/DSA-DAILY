class Solution {
    public int maxDepth(String s) {
        
        int curr = 0;
        int max = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                curr ++;
            }else if(c == ')'){
                max = Math.max(curr , max);
                curr --;
            }
        }

        return max;
    }
}