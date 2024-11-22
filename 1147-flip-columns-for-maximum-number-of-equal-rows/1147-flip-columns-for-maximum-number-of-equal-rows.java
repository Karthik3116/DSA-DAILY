class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // 0 0 0
        // 0 0 1
        // 1 1 0

        // 0 1
        // 1 1

        Map<String, Integer> count = new HashMap<>();

    for (int i = 0; i < matrix.length; i++) {
        // Transform the row directly into a key
        int[] transformedRow = new int[matrix[i].length];
        int starts = matrix[i][0];
        for (int j = 0; j < matrix[i].length; j++) {
            transformedRow[j] = (starts == 0) ? 1 - matrix[i][j] : matrix[i][j];
        }

        // Use Arrays.toString() as a key for counting
        String key = Arrays.toString(transformedRow);
        count.put(key, count.getOrDefault(key, 0) + 1);
    }

    // Find the maximum count
    return count.values().stream().max(Integer::compare).orElse(0);

    }
}