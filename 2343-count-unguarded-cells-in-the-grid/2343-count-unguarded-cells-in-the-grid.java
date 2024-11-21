class Solution {
    public void bfs(String[][] grid , int row , int col){
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[] {row , col , 0});
        q.add(new int[] {row , col , 1});
        q.add(new int[] {row , col , 2});
        q.add(new int[] {row , col , 3});

        while(!q.isEmpty()){
            int []node = q.poll();
            int newr = node[0];
            int newc = node[1];
            int dir = node[2];

            switch(dir){
                case 0 : newr = newr - 1;break;
                case 1 : newc = newc - 1;break;
                case 2 : newr = newr + 1;break;
                case 3 : newc = newc + 1;break;
                 
            }

            if(newr < 0 || newr >= grid.length || newc < 0 || newc >= grid[0].length || grid[newr][newc] == "G" || grid[newr][newc] == "W" ){
                continue;
            }

            grid[newr][newc] = "S";
            q.add(new int[] {newr , newc , dir});
        }
        
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        String[][] grid = new String[m][n];

        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                grid[i][j] = "U";
            }
        }   

        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = "G";
        }

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = "G";
        }



        for (int[] guard : guards) {
            bfs(grid , guard[0], guard[1]);
        }

        int count = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j <  n ; j++){
                if(grid[i][j] == "U"){
                    count += 1;
                }
            }
        }

        return count;
        
    }
}