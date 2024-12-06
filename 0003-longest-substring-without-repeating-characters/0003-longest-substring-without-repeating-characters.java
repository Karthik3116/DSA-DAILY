class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int max = 0;

        for(char curr : s.toCharArray()){
            if(set.contains(curr)){
                Iterator<Character> it = set.iterator();
                while(it.hasNext()){
                    char alpha = it.next();
                    it.remove();
                    if(alpha == curr){
                        break;
                    }
                }
            }
            set.add(curr);
            max = Math.max(max , set.size());
        }

        return max;
        
    }
}