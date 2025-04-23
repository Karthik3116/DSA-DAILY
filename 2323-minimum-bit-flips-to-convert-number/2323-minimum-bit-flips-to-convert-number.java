class Solution {
    public int minBitFlips(int start, int goal) {
        
        start ^= goal;
        return Integer.bitCount(start);
    }
}