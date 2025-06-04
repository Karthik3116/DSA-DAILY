class Solution {
    int[][]dp;

    public int solve(int[][]grid , int i , int j){
        
        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || j >= n) return 0;


        if (i == m - 1 && j == n - 1) return 1;

        if(dp[i][j] != -1) return dp[i][j];
        grid[i][j] = -1;
        int down = solve(grid , i+1 , j );
        int right = solve(grid , i , j+1 );
        
        int ans= down + right;
        
        return dp[i][j] = ans;

    }
    public int uniquePaths(int m, int n) {
        
        dp = new int[m+1][n+1];
        int[][]grid = new int[m][n];
        

        for(int[] d : dp) Arrays.fill(d , -1);

        return solve(grid , 0 , 0);
    }
}