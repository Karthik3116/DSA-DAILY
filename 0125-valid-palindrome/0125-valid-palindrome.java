class Solution {
    public boolean isPalindrome(String s) {
        String small_string = s.toLowerCase();
        String new_string = "";

        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isLetterOrDigit(small_string.charAt(i))){
                new_string += small_string.charAt(i);
            }
        }

        int last = new_string.length()-1;
        boolean is_palindrome = true;
        for(int i = 0 ; i < new_string.length() ; i++){
            if(new_string.charAt(i) == new_string.charAt(last)){
                last --;
            }else{
                is_palindrome = false;
                break;
            }
        }

        return is_palindrome;
    }
}