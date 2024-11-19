// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         long csum = 0;
//         long ans = 0;

//         for(int i = 0 ; i < k ; i++){
//             map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
//             csum += nums[i];
//         }

//         if(map.size() == k){
//             ans = csum;
//         }

        

//         for(int i = k ; i < nums.length ; i++){
            
//             int out = nums[i - k];
//             int in = nums[i];

//             map.put(out , map.get(out) - 1);
//             if(map.get(out) == 0){
//                 map.remove(out);
//             }

//             map.put(in , map.getOrDefault(in , 0) + 1);

//             csum = csum - out + in ;

//             if(map.size() == k){
//                 ans = Math.max(ans , csum);
//             }
            
//         }

//         return ans;
        
//     }
// }



class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long csum = 0;
        long ans = 0;

        int windowStart = 0; // Represents the start of the current window

        for (int i = 0; i < nums.length; i++) {
            int in = nums[i];
            map.put(in, map.getOrDefault(in, 0) + 1);
            csum += in;

            // Maintain the window size as 'k'
            if (i - windowStart + 1 > k) {
                int out = nums[windowStart];
                map.put(out, map.get(out) - 1);
                if (map.get(out) == 0) {
                    map.remove(out);
                }
                csum -= out;
                windowStart++;
            }

            // Validate the window and update the answer
            if (i - windowStart + 1 == k && map.size() == k) {
                ans = Math.max(ans, csum);
            }
        }

        return ans;
    }
}
