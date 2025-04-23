class Solution {

    public int sum(int num){

        int sum = 0;

        while(num != 0){
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }
    public int countLargestGroup(int n) {
        int[]freq = new int[37];
        int max = 0, idx, ans = 0;
        for(int i = 1 ; i <= n ; i++ ){
            idx = sum(i);
            freq[idx]++;
            if(max < freq[idx]){
                max = freq[idx];
            }
        }

        for(int num : freq){
            if(max == num){
                ans++;
            }
        }

        return ans;
        
    }
}