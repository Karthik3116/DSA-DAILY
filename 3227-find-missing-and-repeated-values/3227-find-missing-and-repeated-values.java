class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[]data = new int[grid.length*grid.length+1];

        for(int[] row : grid){
            for(int num : row){
                data[num]++;
            }
        }

        int c = 0, miss = 0;
        int[]ans = new int[2];
        
        System.out.println(Arrays.toString(data));
        for(int i = 1 ; i < data.length ; i++){
            if(ans[0] != 0 && ans[1] != 0){break;}

            if(data[i] == 2){
                ans[0] = i;
            }
            if(data[i] == 0){
                ans[1] = i;
            }
        }

        return ans;
    }
}