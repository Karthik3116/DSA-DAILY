class Pair{
    int first;
    int second;

    Pair(int first , int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int stcolor = image[sr][sc];
        

        int m = image.length;
        int n = image[0].length;

        Queue<Pair>q = new LinkedList<>();
        boolean[][]visited = new boolean[m][n];


        q.add(new Pair(sr,sc));
        visited[sr][sc] = true;

        int[] rowdir = {-1,1,0,0};
        int []coldir = {0,0,-1,1};
        

        while(!q.isEmpty()){

            Pair node = q.poll();
            int row = node.first;
            int col = node.second;

            image[row][col] = color;

            for(int k = 0 ; k < 4 ; k++){
                int nrow = row + rowdir[k];
                int ncol = col + coldir[k];

                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && !visited[nrow][ncol] && image[nrow][ncol] == stcolor ){
                    visited[nrow][ncol] = true;
                    q.add(new Pair(nrow , ncol));
                }
            }


        }


        return image;



         
    }
}