class Solution {

    public StringBuilder tostringlinear(int[][]grid){
        StringBuilder sb = new StringBuilder();
        for(int [] row : grid){
            for(int num : row ){
                sb.append(Integer.toString(num));
            }
        }

        return sb;
    }
    
    public int[][] to2dvec(StringBuilder sb) {
        int[][] arr = new int[2][3];
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sb.charAt(index) - '0'; 
                index++;
            }
        }
        return arr;
    }

    public int[] findzero(int[][] grid){
        int []arr = new int[2];
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 3; j++){
                if(grid[i][j] == 0){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return new int[] {};
    }

    public int[][] swap(int[][]grid , int nzr , int nzc , int zr , int zc){
        int[][]temp = new int[2][3];
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                temp[i][j] = grid[i][j]; 
            }
        }
        temp[zr][zc] = grid[nzr][nzc];
        temp[nzr][nzc] = 0;

        return temp;
    }

    public int bfs(int[][] grid, int[][] ref) {
        Queue<String> q = new LinkedList<>();
        Set<String> v = new HashSet<>();
        
        String start = tostringlinear(grid).toString();
        String target = tostringlinear(ref).toString();

        if(start.equals(target)){
            return 0;
        }
        q.add(start);
        v.add(start);

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            steps += 1;

            for (int i = 0; i < size; i++) {
                String current = q.poll();
                int[][] curstate = to2dvec(new StringBuilder(current));
                int[] zpos = findzero(curstate);
                int zrow = zpos[0];
                int zcol = zpos[1];

                for (int[] dir : directions) {
                    int nzrow = zrow + dir[0];
                    int nzcol = zcol + dir[1];

                    if (nzrow >= 0 && nzrow < 2 && nzcol >= 0 && nzcol < 3) {
                        String swapped = tostringlinear(swap(curstate, nzrow, nzcol, zrow, zcol)).toString();

                        if (swapped.equals(target)) {
                            return steps;
                        }

                        if (!v.contains(swapped)) {
                            q.add(swapped);
                            v.add(swapped);
                        }
                    }
                }
            }
        }

        return -1;
    }


    public int slidingPuzzle(int[][] board) {
        
        int[][]ref = new int[][]{{1,2,3},{4,5,0}};
        
        return bfs(board , ref);
    }
}