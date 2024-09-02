class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        int sum = 0;
        int index = 0;
        int ans;
        while(sum <= k){
            if(index >= chalk.length){
                index = 0;
            }
            sum += chalk[index];
            index = index + 1;
        }

        return index-1;
    }
}