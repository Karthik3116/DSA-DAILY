class Solution {
    public double calc(double x , int n){
        if(n == 0){return 1;};
        if(x == 0){return 0;};

        double temp = calc(x , n/2);

        if(n%2 == 0){
            return temp * temp;
        }

        else{
            return x * temp * temp;
        }
    }
    public double myPow(double x, int n) {
        
        if(n < 0){
            x = 1/x;
            n = -n;
        }

        return calc(x , n);

    }
}