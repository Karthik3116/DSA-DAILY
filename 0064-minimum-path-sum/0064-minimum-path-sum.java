class Solution {

    int ans;
    int[][]dp;
    public int solve(int[][]grid , int i , int j, int curr_path){

        int m = grid.length , n = grid[0].length;

        if(i >= m || i < 0 || j >= n || j < 0 ){
            return -1;
        }
        if(i == m - 1 && j == n - 1){
            ans = Math.min(ans , curr_path+grid[i][j]);
            System.out.println(curr_path);
            return dp[i][j]  = ans;
        }

        if(dp[i][j] != -1) return dp[i][j];
        
        int down = solve(grid , i+1 , j , curr_path + grid[i][j]);
        int right = solve(grid , i , j+1 , curr_path + grid[i][j]);
        
        
     
        
        return  dp[i][j] =  Math.min(right , down);



    }
    public int solver(int[][] grid,int i,int j,int[][] dp){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int nextRes=Math.min(solver(grid,i+1,j,dp),solver(grid,i,j+1,dp));
        if(nextRes==Integer.MAX_VALUE){
            return nextRes;
        }
        return dp[i][j] = grid[i][j]+nextRes;
    }
    public int minPathSum(int[][] grid) {
        
        int m = grid.length , n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int[] d : dp) Arrays.fill(d , Integer.MAX_VALUE);

        // ans = Integer.MAX_VALUE;
        return solver(grid,0,0,dp);
        // return solve(grid , 0 , 0 ,0);
        // for(int[] d : dp){
        //     System.out.println(Arrays.toString(d));
        // }
        // return ans;
    }
}