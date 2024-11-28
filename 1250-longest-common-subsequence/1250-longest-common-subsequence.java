class Solution {
    public int f( int a , int b,String one , String two , HashMap<String, Integer> map){
        // System.out.println(map);
        if(a < 0 || b < 0){
            return 0;
        }

        String key = a + "," + b;
        if (map.containsKey(key)) {
            return map.get(key); 
        }

        if(one.charAt(a) == (two.charAt(b))){
            int result = 1 + f(a - 1, b - 1, one, two, map);
            map.put(key, result);
            return result;

        }
        int result = Math.max(f(a - 1, b, one, two, map), f(a, b - 1, one, two, map));
        map.put(key, result);
        return result;

    }
    public int longestCommonSubsequence(String text1, String text2) {
        HashMap<String,Integer> map = new HashMap<>();
        return f(text1.length() - 1,text2.length() - 1,text1 , text2 , map);
    }
}