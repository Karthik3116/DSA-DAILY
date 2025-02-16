// class Solution {
//     public int heightChecker(int[] heights) {
//         int[]expected = Arrays.copyOf(heights , heights.length);
//         Arrays.sort(expected);
//         int count = 0;


//         for(int i = 0 ; i < expected.length ; i++){
//             if(expected[i] != heights[i]){
//                 count++;
//             }
//         }

//         return count;
//     }
// }

class Solution {
    public int heightChecker(int[] heights) {
        char[] freq = new char[101];

        for(int num : heights){
            freq[num]++;
        }

        int curr = 0, count = 0;
        // System.out.println(Arrays.toString(freq));
        for(int i = 0 ; i < heights.length ; i++){

            while(freq[curr] == 0){
                curr++;
            }

            if(curr != heights[i]){
                count++;
            }

            freq[curr]--;

        }
        return count;
    }
}