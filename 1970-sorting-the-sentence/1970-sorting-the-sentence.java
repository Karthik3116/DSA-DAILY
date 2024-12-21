class Solution {

    public String solve(String s){
        String[]words = s.split(" ");
        String[] new_words = new String[words.length];

        for(String word : words){
            int idx = Integer.parseInt(Character.toString(word.charAt(word.length() - 1)));
            new_words[idx -1] = word.substring(0,word.length() - 1) + " ";
        }
        StringBuilder ans = new StringBuilder();
        for(String word : new_words){
            ans.append(word);
        }
        return ans.toString().substring(0,ans.length() - 1);
    }
    public String sortSentence(String s) {
        
        return solve(s);
    }
}