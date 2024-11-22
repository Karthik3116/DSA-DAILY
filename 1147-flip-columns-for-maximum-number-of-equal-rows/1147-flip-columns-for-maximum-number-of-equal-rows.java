class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // 0 0 0
        // 0 0 1
        // 1 1 0

        // 0 1
        // 1 1

        HashMap<String,Integer> count = new HashMap<>();

        for(int i = 0 ; i < matrix.length ; i++){
            StringBuilder s = new StringBuilder();
            int starts = matrix[i][0];
            for(int j = 0 ; j < matrix[i].length ; j++){
                
                if(starts == 0){
                    if(matrix[i][j] == 0){
                        s.append(1);
                    }else{
                        s.append(0);
                    }
                }
                
                else{        
                    s.append(matrix[i][j]);
                }

                
            }   


            String key = s.toString();

            count.put( key, count.getOrDefault(key , 0) + 1);
            
        }

        int max = 0;

        for(Map.Entry<String,Integer> entry : count.entrySet()){
            max = Math.max(max , entry.getValue());
        }

        return max;
    }
}