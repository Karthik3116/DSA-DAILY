class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int ans = 0;
        for(char one : s.toCharArray()){
            
            if(set.contains(one)){
                Iterator<Character> it = set.iterator();
                while(it.hasNext()){
                    char alpha = it.next();
                    it.remove();
                    if(alpha == one){
                        break;
                    }
                }
            }
            set.add(one);
            ans = Math.max(ans , set.size());

            System.out.println(set);

        }

        return ans;
    }
}