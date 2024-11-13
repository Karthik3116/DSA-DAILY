class Solution {
    HashSet<Integer> set = new HashSet<>();

    public static int getsum(int num){
        int sum = 0;
        while(num > 0){
            int last = num %10;
            sum += last*last;
            num = num / 10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        
        int ans = getsum(n);
        if(ans == 1){
            return true;
        }
        if(set.contains(ans)){
            return false;
        }

        set.add(n);

        return isHappy(ans);

        
    }
}