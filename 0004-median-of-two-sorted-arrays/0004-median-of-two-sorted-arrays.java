class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] nums = new int[nums1.length + nums2.length] ;


        int i = 0, j = 0, k = 0 , count = 0;
        int mid = nums.length / 2;
        boolean even = nums.length % 2 == 0;


        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
            count += 1;

            if(count > mid){
                if (even) {
            
                    return (nums[mid] + nums[mid - 1]) / 2.0;
                } else {
                    
                    return nums[mid];
                }
            }
        }


        while (i < nums1.length) {
            nums[k++] = nums1[i++];
            count += 1;

            if(count > mid){
                if (even) {
            
                    return (nums[mid] + nums[mid - 1]) / 2.0;
                } else {
                    
                    return nums[mid];
                }
            }
        }


        while (j < nums2.length) {
            nums[k++] = nums2[j++];
            count += 1;

            if(count > mid){
                if (even) {
            
                    return (nums[mid] + nums[mid - 1]) / 2.0;
                } else {
                    
                    return nums[mid];
                }
            }
        }


        // if (even) {
            
        //     return (nums[mid] + nums[mid - 1]) / 2.0;
        // } else {
            
        //     return nums[mid];
        // }

        return -1;
    }
}
