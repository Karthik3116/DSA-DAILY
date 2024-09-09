class Solution {
    public int search(int[] nums, int target) {
        
        int minindex = 0;
        int last = nums.length -1 ;
        for(int i = 1 ; i < nums.length-1 ; i++){

            int curminindex = (nums[i] < nums[last]) ? i : last;
            
            minindex = nums[minindex] < nums[curminindex] ? minindex : curminindex;
            last --;

        }

        for(int i = minindex ; i < nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }

        for(int i = 0 ; i < minindex ; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }
}