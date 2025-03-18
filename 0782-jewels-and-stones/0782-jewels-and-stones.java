class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        
        int[]small = new int[26];
        int[]cap = new int[26];
        
        for(char c : jewels.toCharArray()){

            if(Character.isLowerCase(c)){
                small[c-'a']++;
            }else{
                cap[Character.toLowerCase(c) - 'a']++;
            }
        }
        int ans = 0;
        for(char c : stones.toCharArray()){
            if(Character.isLowerCase(c) && small[c-'a'] != 0){
                ans++;
            }else{
                if(Character.isUpperCase(c) && cap[Character.toLowerCase(c) - 'a'] != 0){
                    ans++;
                }
            }
        }

        return ans;
    }
}