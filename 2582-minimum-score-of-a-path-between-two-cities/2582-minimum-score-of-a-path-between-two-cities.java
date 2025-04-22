
class DSU{
    List<Integer> parent = new ArrayList<>();

    DSU(int nodes){
        for(int i = 0 ; i <= nodes ; i++){
            parent.add(i);
        }
    }

    public int findparent(int node){

        if(parent.get(node) != node){
            parent.set(node , findparent(parent.get(node)));
        }
        return parent.get(node);
    }

    public void union(int x , int y){

        int rootx = findparent(x);
        int rooty = findparent(y);

        if(rootx < rooty){

            parent.set(rooty , rootx);
        }else{
            parent.set(rootx , rooty);
        }
        
    }
}

class Solution {
    public int minScore(int n, int[][] roads) {
        DSU dsu = new DSU(n);
        for (int[] road : roads) {
            dsu.union(road[0], road[1]);
        }

        int p1 = dsu.findparent(n), ans = Integer.MAX_VALUE;

        for(int[]node : roads){

            if(dsu.findparent(node[0]) == p1 || dsu.findparent(node[1]) == p1){
                ans = Math.min(ans , node[2]);
            }
        }

        return ans;
    }
}