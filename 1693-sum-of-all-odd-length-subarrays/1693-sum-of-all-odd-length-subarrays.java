class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n = arr.length, output = 0;
        for (int start = 0; start < n; start++) {
            
            for (int end = start; end < n; end++) {
                
                if ((end - start + 1) % 2 != 0) {

                    for (int k = start; k <= end; k++) {
                        output += arr[k] ;
                    }
                    // System.out.println();
                }
            }
        }

        return output;
    }
}