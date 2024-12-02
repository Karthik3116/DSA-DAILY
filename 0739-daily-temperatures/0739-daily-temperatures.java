class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[] {temperatures[0] , 0});

        for(int i = 1 ; i < n ; i++){

            int current = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0] < current ){
                int []node = stack.pop();
                int pos = node[1];
                ans[pos] = i - pos;
            }
            
            stack.push(new int[] {current , i});
        }

        return ans;
    }
}