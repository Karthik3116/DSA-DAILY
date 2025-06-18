class Solution {
    public int longestBeautifulSubstring(String word) {
        
        int count = 1;
        int max = 0;
        int vcount = 1;

        for(int i = 1 ; i < word.length() ; i++){
            
            char curr = word.charAt(i);
            char prev = word.charAt(i-1);

            if(curr == prev){
                count++;
            }else if(curr > prev){
                count++;
                vcount++;
            }else{
                count = 1;
                vcount = 1;
            }

            if(vcount == 5){
                max = Math.max(count , max);
            }
            
            

        }

        return max;
    }
}