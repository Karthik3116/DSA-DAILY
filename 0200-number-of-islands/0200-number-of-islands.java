class Pair{
    int first;
    int secound;

    Pair(int first , int secound){
        this.first = first;
        this.secound = secound;
    }
}

class Solution {

    public void bfs(boolean[][] visited , char[][] grid , int i , int j){
        Queue<Pair> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new Pair(i,j));

        int n = grid.length;
        int m = grid[0].length;
        

        int[] rowdir = {-1,1,0,0};
        int[] coldir = {0,0,-1,1};

        while(!q.isEmpty()){
            
            Pair node = q.poll();
            int row = node.first;
            int col = node.secound;

            for(int k = 0 ; k < 4 ; k++){
                int newrow = row + rowdir[k];
                int newcol = col + coldir[k];

                if(newrow >= 0 && newrow < n && newcol >= 0 && newcol < m && grid[newrow][newcol] == '1' && !visited[newrow][newcol] ){
                    q.add(new Pair(newrow, newcol));
                    visited[newrow][newcol] = true;
                }
                
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        boolean[][]visited = new boolean[n][m];
        int count = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    count += 1;
                    bfs(visited , grid , i , j);
                }
            }
        }


        return count;
        
    }
}