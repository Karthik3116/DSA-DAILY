class Solution {
    public int findChampion(int[][] grid) {
        
        int ans = 0, len = grid.length - 1;

        for(int[] row : grid){
            int count = 0;
            
            for(int num : row){
                if(num == 1){
                    count += 1;
                }
                if(count == len){
                    return ans;
                }
            }
            ans += 1;
        }

        return -1;

    }
}