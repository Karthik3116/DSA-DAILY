class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int small_word = 0;

        for(int i = 1 ; i < strs.length ; i++){
            if(strs[i].length() < strs[small_word].length()){
                small_word = i;
            }
        }
        
        int l = 0, r = strs[small_word].length();
        
        int count = 0;

        boolean same = true;

        while(l < r){
            char ref = strs[0].charAt(l);
            
            for(int i = 1 ; i < strs.length ; i++ ){
                char one = strs[i].charAt(l);
                if(ref != one){
                    same = false;
                    break;
                }
            }
            
            if(same){
                sb.append(ref);
                l++;
            }else{
                break;
            }

        }



        return sb.toString();
    }
}