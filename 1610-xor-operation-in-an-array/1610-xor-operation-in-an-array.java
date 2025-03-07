class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;

        for(int i = 0 ; i < n ; i++){
            // System.out.println(start + 2*i);
            xor ^= start + 2*i;
        }

        return xor;

        
    }
}