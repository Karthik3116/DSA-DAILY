class Solution {
    public int fib(int n) {
        int one = 0 , two = 1;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return two;
        }

        int ans = 0;

        for(int i = 2 ; i <= n ; i++){
            ans = one + two;
            one = two;
            two = ans;
        }

        return ans;
    }
}