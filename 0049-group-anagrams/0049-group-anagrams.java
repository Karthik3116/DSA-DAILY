class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mymap = new HashMap<>();
        for(String one : strs){

            
            char []arr = one.toCharArray();

            Arrays.sort(arr);
            String str = Arrays.toString(arr);
            if(mymap.containsKey(str)){
                    
                List<String> temp = new ArrayList<>(mymap.get(str));
                temp.add(one);
                mymap.put(str ,temp );

            }else{

                List<String> temp = new ArrayList<>();
                temp.add(one);
                mymap.put(str ,temp );
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : mymap.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}