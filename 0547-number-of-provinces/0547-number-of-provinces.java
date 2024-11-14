class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> list , boolean[] visited , int node){
        visited[node] = true;

        for(int neghibour : list.get(node)){
            if(!visited[neghibour]){
                dfs(list , visited , neghibour);
            }
        }
    }



    public void bfs(ArrayList<ArrayList<Integer>> list, boolean[] visited , int node){

        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()){
            int current = q.poll();

            for(int neghibour : list.get(current)){
                if(!visited[neghibour]){
                    q.add(neghibour);
                    visited[neghibour] = true;
                }
            }

        }

    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0 ;  i < isConnected.length ; i++){
            list.add(new ArrayList<>());
            for(int j = 0 ; j < isConnected.length ; j++){
                if(isConnected[i][j] == 1 && i != j){
                    list.get(i).add(j);
                }
            }
        }




        boolean []visited = new boolean[isConnected.length];
        int count = 0;
        for(int i = 0 ; i < isConnected.length ; i++){
            if(!visited[i]){
                count += 1;
                bfs(list , visited , i);
            }
        }

        return count;

    }
}