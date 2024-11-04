class Solution {
    public boolean isAnagram(String s, String t) {
        
        

        char []onec = s.toCharArray();
        char []twoc = t.toCharArray();
        Arrays.sort(onec);
        Arrays.sort(twoc);
        
        
        return Arrays.equals(onec , twoc);
         
    }
}