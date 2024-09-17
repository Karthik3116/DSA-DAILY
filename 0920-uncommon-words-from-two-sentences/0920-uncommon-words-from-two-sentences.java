class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String , Integer> map  = new HashMap<>();
        String []one = s1.split(" ");
        String []two = s2.split(" ");
        
        int a1 = one.length;
        int a2 = two.length;
        
        String []words  = new String[a1 + a2];

        System.arraycopy(one, 0 , words , 0 , a1);
        System.arraycopy(two, 0 , words , a1 , a2);

        for(String word : words){
            if(map.containsKey(word)){
                map.put(word , map.get(word) + 1);
            }else{
                map.put(word , 1);
            }
        }
        ArrayList<String> list = new ArrayList<>();

        for(String key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }
        
        return list.toArray(new String[0]);
    }
}