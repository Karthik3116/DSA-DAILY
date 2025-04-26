class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder(s);

        int left = 0 , right = s.length()-1;

        List<Character> vowels = new ArrayList<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));

        char temp;

        while(left < right){

            if(vowels.contains(sb.charAt(left)) && vowels.contains(sb.charAt(right))){
                
                temp = sb.charAt(left);
                
                sb.setCharAt(left , sb.charAt(right));

                sb.setCharAt(right , temp);
                
                left++;right--;continue;   
            }

            if( !vowels.contains(sb.charAt(left))){
                left++;
            }

            if( !vowels.contains(sb.charAt(right))){
                right--;
            }
            
        }        
        return sb.toString();
    }
}