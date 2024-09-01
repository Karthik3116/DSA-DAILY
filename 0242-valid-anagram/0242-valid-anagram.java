class Solution {
    public boolean isAnagram(String s, String t) {
        char w1[] = new char[s.length()];
        char w2[] = new char[t.length()];

        for(int i = 0 ; i < s.length() ; i++){
            w1[i] = s.charAt(i);
        }
        
        for(int i = 0 ; i < t.length() ; i++){
            w2[i] = t.charAt(i);
        }

        Arrays.sort(w1);
        Arrays.sort(w2);
        

        return Arrays.toString(w1).equals(Arrays.toString(w2));
    }
}
