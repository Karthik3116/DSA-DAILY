// class Solution {
//     public int chalkReplacer(int[] chalk, int k) {
        
//         // int sum = 0;
//         // int index = 0;
//         // int ans;
//         // while(sum <= k){
//         //     if(index >= chalk.length){
//         //         index = 0;
//         //     }
//         //     sum += chalk[index];
//         //     index = index + 1;
//         // }

//         // return index-1;

//         int total = 0;
//         for(int c: chalk){
//             total += c;
//         }

//         k %= total;

//         for(int i = 0 ; i < chalk.length ; i++){

//             if(k < chalk[i]){
//                 return i;
//             }
//             k -= chalk[i];
//         }

//         return -1;
//     }
// }


class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // Calculate the total sum of chalk
        long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }

        // Reduce k by the total chalk sum using modulo
        k %= totalChalk;

        // Find the index of the student who will replace the chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        // Should not reach here as the problem guarantees a solution
        return -1;
    }
}
