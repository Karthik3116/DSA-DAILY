class Solution {
    public boolean is_pal(String s){
        
        int left = 0 , right = s.length() - 1;
        
        while(left < right){
            if(s.charAt(right) != s.charAt(left) ){
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }

    public int solve(String input){
        int output = 0;
        for(int i = 0 ; i < input.length() ; i++){
            for(int j = i + 1 ; j <= input.length() ; j++){
                if(is_pal(input.substring(i,j)) ){
                    // System.out.println(input.substring(i,j));
                    output++;
                }
            }
        }
        
        return output;
    }
    public int countSubstrings(String s) {
        
        return solve(s);
    }
}