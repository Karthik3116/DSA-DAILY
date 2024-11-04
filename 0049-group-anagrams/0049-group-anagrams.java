class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mymap = new HashMap<>();
        for(String one : strs){

            
            char []arr = one.toCharArray();

            Arrays.sort(arr);

            if(mymap.containsKey(Arrays.toString(arr))){
                    
                List<String> temp = new ArrayList<>(mymap.get(Arrays.toString(arr)));
                temp.add(one);
                mymap.put(Arrays.toString(arr) ,temp );

            }else{

                List<String> temp = new ArrayList<>();
                temp.add(one);
                mymap.put(Arrays.toString(arr) ,temp );
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : mymap.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}