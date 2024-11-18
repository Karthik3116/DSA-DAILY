class Pair{
    int one;
    int two;
    Pair(int one , int two){
        this.one = one;
        this.two = two;
    }
}
class Solution {
    public int bfs(boolean[][] visited , int[][]grid , int i , int j ){
        int m = grid.length , n  = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i , j));
        visited[i][j] = true;
        

        int area = 1;
        int[] rowdir = {-1, 0, 0, 1};
        int[] coldir = {0, -1, 1, 0};


        while(!q.isEmpty()){
            Pair node = q.poll();
            int row = node.one;
            int col = node.two;
            for(int k = 0 ; k < 4 ; k++){
                int newrow = row + rowdir[k];
                int newcol = col + coldir[k];

                if(newrow >= 0 && newrow < m && newcol >= 0 && newcol < n  && !visited[newrow][newcol] && grid[newrow][newcol] == 1){
                    area += 1;
                    visited[newrow][newcol] = true;
                    q.add(new Pair(newrow , newcol));
                }
                
            }
        }

        return area;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length , n  = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        int area = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    area = Math.max(area , bfs(visited , grid , i , j));
                }
                
            }
        }

        return area;
        
    }
}