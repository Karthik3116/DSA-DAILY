
// import java.util.TreeMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer , Integer> mymap  = new HashMap<>();

        for(int num : nums){
            mymap.put(num , mymap.getOrDefault(num , 0 ) + 1);
        }

        List<Map.Entry<Integer , Integer>> list = new ArrayList<>(mymap.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        int i = 0; 
        int []ans = new int[k];
        for(Map.Entry<Integer , Integer> entry : list){
            if(i < k){
                ans[i] = entry.getKey();
                i++;
            }
        }

        return ans;
        
    }
}