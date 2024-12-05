class Solution {
    public boolean isSubsequence(String s, String t) {
        int match = 0;
        if(s.length() == 0){return true;};
        if(t.length() == 0){return false;};
        
        for(char curr : t.toCharArray()){
            if(curr == s.charAt(match)){
                match++;
            }
            if(match == s.length()){
                return true;
            }
        }

        return false;
    }
}