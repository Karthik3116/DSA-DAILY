class Solution {
    public int maxDifference(String s) {
        int[]count = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i) - 'a']++;
        }

        int max_odd = Integer.MIN_VALUE,min_even = Integer.MAX_VALUE;

        for(int num : count){
            if(num % 2 != 0 && num != 0){
                max_odd = Math.max(max_odd , num);
            }else if( num != 0){
                min_even = Math.min(min_even , num);
            }
        }

        return max_odd -min_even;

    }
}