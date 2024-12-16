class Solution {

    
    public void solve(Map<String ,String> map, StringBuilder sb , int index , String digits ,List<String> result){
        if(digits.length() == index){
            result.add(sb.toString());
            return;
        }

        char curr_digit = digits.charAt(index);
        String letters = map.get(Character.toString(curr_digit));

        for(char letter : letters.toCharArray() ){
            sb.append(letter);
            solve(map , sb , index + 1, digits , result);
            sb.deleteCharAt(sb.length() - 1);
        } 
    }
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        Map<String, String> phonePad = new HashMap<>();
        phonePad.put("2", "abc");
        phonePad.put("3", "def");
        phonePad.put("4", "ghi");
        phonePad.put("5", "jkl");
        phonePad.put("6", "mno");
        phonePad.put("7", "pqrs");
        phonePad.put("8", "tuv");
        phonePad.put("9", "wxyz");



        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();

        solve(phonePad , sb , 0 , digits , result);
        return result;
    }
}