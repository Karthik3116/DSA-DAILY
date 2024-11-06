class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list of map entries and sort by frequency in descending order
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        // Step 3: Extract the top k frequent elements
        int[] ans = new int[k];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if (count < k) {
                ans[count] = entry.getKey();
                count++;
            }
        }
        return ans;
    }
}
