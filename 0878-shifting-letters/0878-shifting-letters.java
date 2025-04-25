class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        int sum = 0;
        char[]ans = new char[s.length()];

        for(int i = s.length() - 1 ; i >= 0 ; i--){

            sum = (sum + shifts[i]) % 26;
            ans[i] = (char)((s.charAt(i) -'a' + sum) % 26 + 'a' );
        }

        return new String(ans);
    }
}