class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        char []two = str2.toCharArray(); 
        int same = 0;
        if(str1.length() >= str2.length()){
            for(char c : str1.toCharArray()){
                if(same == str2.length()){
                    break;
                }
                    
                if(c == two[same] ){
                    same++;
                    continue;
                }
                int ascii = c+1;
                if(ascii > 122){
                    ascii = 97;
                }
                char temp = (char) ascii;
                if(temp == two[same]){
                    same++;
                }
            
            
            }
            return same == str2.length()?true:false;
        }

        return false;
    }
}