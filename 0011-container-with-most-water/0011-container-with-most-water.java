class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        
        int l = 0, r = height.length - 1;
   
        
        while(l < r){
            int x = r - l;

            System.out.println(height[l] + " "+ height[r]);
            int y = Math.min(height[l] , height[r]);
            

            area = Math.max(area , x*y);
            
            while(l <= r && height[r] <= y){
                
                r--;
            }
            while(l <= r && height[l] <= y){
                l++;
            }
        }

        return area;
    }
}