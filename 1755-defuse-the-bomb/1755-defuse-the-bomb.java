class Solution {
    public int[] decrypt(int[] code, int k) {
        int []ans = new int[code.length];

        if(k == 0){
            return new int[code.length];
        }else if( k > 0){

            for(int i = 0 ; i < code.length ; i++){

                int index = i + 1 ;
                for(int j = 1 ; j <= k ; j++){
                    
                    if(index >= code.length){
                        index = 0;
                    }
                    ans[i] += code[index];
                    System.out.println(code[index]);
                    index += 1;
                }
            }
        }else{
            
            for(int i = 0 ; i < code.length ; i++){
                
                int index = i - 1 ;
                
                for(int j = 1 ; j <= -1*k ; j++){
                    
                    if(index < 0){
                        index = code.length - 1;
                    }
                    ans[i] += code[index];
                    // System.out.println(code[index]);
                    index -= 1;
                }
            }

        }

        return ans;
        
    }
}