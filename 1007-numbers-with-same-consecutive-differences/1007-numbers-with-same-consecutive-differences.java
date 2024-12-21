class Solution {

    public void solve(int n , int k , List<Integer> output , int lastdigit , List<Integer> ans){

        if(output.size() == n){
            
            int num = 0;
            for(int x : output){
                num = num * 10 + x;
            }
            ans.add(num);
            return;
        }


        for(int i = 0 ; i < 10 ; i++){
            if(lastdigit == -1){
                if(i != 0){
                    output.add(i);
                    solve(n , k , output, i , ans);
                    output.remove(output.size() - 1);
                }
            }else{

                if(Math.abs(i-lastdigit) == k){
                    output.add(i);
                    solve(n , k , output, i , ans);
                    output.remove(output.size() - 1);
                    
                }
            }

        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        
        List<Integer> ans = new ArrayList<>();

        solve(n, k , new ArrayList<>() , -1, ans );

        int[]res = new int[ans.size()];

        for(int i = 0 ; i < ans.size() ; i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}