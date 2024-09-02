class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        // int sum = 0;
        // int index = 0;
        // int ans;
        // while(sum <= k){
        //     if(index >= chalk.length){
        //         index = 0;
        //     }
        //     sum += chalk[index];
        //     index = index + 1;
        // }

        // return index-1;

        long total = 0;
        for(int c: chalk){
            total += c;
        }

        k %= total;

        for(int i = 0 ; i < chalk.length ; i++){

            if(k < chalk[i]){
                return i;
            }
            k -= chalk[i];
        }

        return -1;
    }
}