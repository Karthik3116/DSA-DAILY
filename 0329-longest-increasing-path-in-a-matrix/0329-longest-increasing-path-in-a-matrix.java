class Solution {
    int[][]dp;

    public boolean isValid(int m , int n , int i , int j){

        if(i < 0 || i >= m || j < 0 || j >= n){
            return false;
        }

        return true;
    }

    public int solve(int[][]grid , int i , int j){
        
        int m = grid.length , n = grid[0].length;
        
        if(dp[i][j] != -1) return dp[i][j];
        

        if(!isValid(m , n , i , j)){
            return 0;
        }

        int curr_path = 1, curr = grid[i][j];


        int[]row_dir = {1,0,-1,0};
        int[]col_dir = {0,1,0,-1};

        for(int k = 0 ; k < 4 ; k++){

            int del_row = i + row_dir[k] , del_col = j + col_dir[k];
            
            if(isValid(m , n , del_row , del_col) && curr < grid[del_row][del_col]){

                curr_path = Math.max(curr_path , 1 + solve(grid , del_row , del_col));
            }

        }

        return dp[i][j] = curr_path;


        

    }
    public int longestIncreasingPath(int[][] matrix) {

        int ans = 1;
        int m = matrix.length , n = matrix[0].length;

        dp = new int[m][n];

        for(int[]d : dp) Arrays.fill(d , -1 );

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                ans = Math.max(ans , solve(matrix , i , j));
            }
        }

        return ans;


    }
}