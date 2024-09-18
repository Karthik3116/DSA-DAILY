
class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = Integer.toString(nums[i]);
        }

        // Sort strings based on custom comparator
        Arrays.sort(numStrs, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                // Compare concatenated results
                return (y + x).compareTo(x + y);
            }
        });

        // Handle the case where all numbers are zero
        if (numStrs[0].equals("0")) {
            return "0";
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        for (String numStr : numStrs) {
            sb.append(numStr);
        }

        return sb.toString();
    }
}
