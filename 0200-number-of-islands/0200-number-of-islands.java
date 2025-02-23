class Pair{
    int one ;
    int two;
    Pair(int one  , int two){
        this.one  = one ;
        this.two = two ;
    }
}
class Solution {

    public void bfs(char[][]grid  , int row , int col){

        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row , col));
        grid[row][col] = '0';
        int[]row_dir = {1,-1,0,0};
        int[]col_dir = {0,0,1,-1};

        while(!q.isEmpty()){

            Pair node = q.poll();
            int node_row = node.one;
            int node_col = node.two;

            for(int k = 0 ; k < 4 ; k++){
                int new_row = node_row - row_dir[k];
                int new_col = node_col - col_dir[k];

                if(new_row >= 0 && new_row < m && new_col >= 0 && new_col < n && grid[new_row][new_col] == '1'){
                    q.add(new Pair(new_row,new_col));
                    grid[new_row][new_col] = '0';

                }
                
            }
        }

    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n ; j++){
                if( grid[i][j] == '1'){
                    bfs(grid  , i , j);
                    count++;
                }
            }
        }

        return count;
    }
}