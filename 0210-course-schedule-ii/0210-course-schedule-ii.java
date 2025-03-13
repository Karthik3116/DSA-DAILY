// import java.util.*;

// class Solution {
//     public boolean dfs(int course, int[] visited, Map<Integer, List<Integer>> map, List<Integer> order) {
//         if (visited[course] == 1) { 
//             return true;
//         }
//         if (visited[course] == 2) { 
//             return false;
//         }
        
//         visited[course] = 1;
        
//         for (int preq : map.get(course)) {
//             if (dfs(preq, visited, map, order)) {
//                 return true;
//             }
//         }
        
//         visited[course] = 2;
//         order.add(course); 
//         return false;
//     }
    
//     public int[] findOrder(int numCourses, int[][] prerequisites) {
//         Map<Integer, List<Integer>> map = new HashMap<>();
//         int[] visited = new int[numCourses];
//         List<Integer> order = new ArrayList<>();
        
//         for (int i = 0; i < numCourses; i++) {
//             map.put(i, new ArrayList<>());
//         }
        
//         for (int[] node : prerequisites) {
//             map.get(node[0]).add(node[1]);
//         }
        
//         for (int i = 0; i < numCourses; i++) {
//             if (dfs(i, visited, map, order)) {
//                 return new int[0]; 
//             }
//         }
        
//         int[] result = new int[numCourses];
//         for (int i = 0; i < numCourses; i++) {
//             result[i] = order.get(i);
//         }
//         return result;
//     }
// }


class Solution {

    public boolean bfs(int i , List<List<Integer>> adj , int[]visited , Stack<Integer> st){

        if(visited[i] == 1){return true;}
        
        if(visited[i] == 2){return false;}

        visited[i] = 1;
        for(int preq : adj.get(i)){

            if(bfs(preq , adj , visited, st)){
                return true;
            }
        }
        visited[i] = 2;
        st.push(i);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adj = new ArrayList<>();

        int[]ans = new int[numCourses];

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < numCourses ; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] node : prerequisites){
            adj.get(node[1]).add(node[0]);
        }


        int[]visited = new int[numCourses];
        
        for(int i = 0 ; i < numCourses ; i++){
            if(visited[i] == 0){
                if(bfs(i, adj , visited , st)){
                    return new int[]{};
                }
            }
        }

        int i = 0;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i++;
        }

        return ans;
    }
}



























