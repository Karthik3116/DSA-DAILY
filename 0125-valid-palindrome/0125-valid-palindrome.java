class Solution {
    public boolean isPalindrome(String s) {
        // String st = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        
        // int right = 0 ; 
        // int left = st.length()-1;

        // while(right < left){

        //     if( st.charAt(right) != st.charAt(left)){
        //         return false;
        //     }
        //     right++;
        //     left--;
        // }

        // return true;

        int l = 0  , r = s.length() - 1 ;

        while(l < r){
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }

            while(r > l && !alphaNum(s.charAt(r))){
                r--;
            }

            if(! (Character.toLowerCase(s.charAt(l)) == (Character.toLowerCase(s.charAt(r))))){
                return false;
            }
            l++;r--;
            
        }

        return true;
    }

    public boolean alphaNum(char c){
        return((c >= 'A' && c <= 'Z') ||
                (c >= 'a' && c <= 'z')||
                (c >= '0' && c <= '9')
                 );
    }
}