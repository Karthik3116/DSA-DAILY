class Solution {
    public boolean isSubsequence(String s, String t) {
        int match = 0;
        if(s.length() == 0 && t.length() > 0){return true;};
        
        if(s.length() == 0 && t.length() == 0){return true;};
        for(char curr : t.toCharArray()){
            if(curr == s.charAt(match) && match <= s.length()){
                match++;
            }
            if(match == s.length()){
                return true;
            }
        }

        return false;
    }
}