class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int i = 0;
        for(char curr : s.toCharArray()){
            while(set.contains(curr)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(curr);
            max = Math.max(max , set.size());
        }

        return max;
        
    }
}