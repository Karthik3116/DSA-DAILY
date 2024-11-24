class Solution {
    public long[] countneg(int[][] grid){
        long count = 0 , sum = 0 , min = 999999 ;
        for(int [] row : grid){
            for(long num : row){
                if(num < 0){
                    count += 1;
                }
                sum += Math.abs(num);
                min = Math.min(min , Math.abs(num));
            }
        }

        return new long[] {count,sum,min};
    }
    public long maxMatrixSum(int[][] matrix) {
        long[] ans = countneg(matrix);
        if(ans[0] % 2 == 0){
            return ans[1];
        }

        return ans[1] - 2*ans[2];
        
    }
}