class Solution {
    public int reverse(int x) {
        int ans = 0;
        boolean less = false;
        double lowerBound = Math.pow(-2, 31);
        double upperBound = Math.pow(2, 31) - 1;

        if(x < 0){
            x = x*-1;
            less = true;
        }
        while(x > 0){
            int last = x%10;
            // System.out.println(last);
            if (ans > (upperBound - last) / 10) {
                return 0;
            }
            ans = ans*10 + last;
            x = x / 10;
        } 

        if(less){
            return -1*ans;
        }
        return ans;
    }
}