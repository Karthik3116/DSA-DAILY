// class Solution {
//     public boolean canAliceWin(int n) {

//         int round = 1, removed = 0;
//         int curr = 10;
        
//         while(removed <= n){
//             removed += curr;
//             curr--;
//             round++;
//         }

//         return round%2 != 0 ?  true:  false;
//     }
// }

class Solution {
    public boolean canAliceWin(int n) {
        // Solve the quadratic equation to find the number of rounds
        int k = (int) Math.ceil((21 - Math.sqrt(21 * 21 - 8 * n)) / 2);

        // Determine the winner based on whether the round is odd or even
        return k % 2 == 0; // True if odd, Alice wins
    }
}
