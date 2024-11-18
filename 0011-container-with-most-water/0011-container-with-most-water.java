class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        
        int l = 0, r = height.length - 1;
        
        while(l < r){
            int x = r - l;

            System.out.println(height[l] + " "+ height[r]);
            int y = Math.min(height[l] , height[r]);
            

            area = Math.max(area , x*y);
            if(height[r] <= height[l]){
                r--;
            }
            else if (height[r] > height[l]){
                l++;
            }
        }

        return area;
    }
}