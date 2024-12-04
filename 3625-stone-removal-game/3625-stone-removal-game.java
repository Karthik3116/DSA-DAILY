class Solution {
    public boolean canAliceWin(int n) {

        int round = 1, removed = 0;
        int curr = 10;
        
        while(removed <= n){
            removed += curr;
            curr--;
            round++;
        }

        return round%2 != 0 ?  true:  false;
    }
}