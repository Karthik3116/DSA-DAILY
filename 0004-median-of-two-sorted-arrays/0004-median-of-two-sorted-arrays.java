class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Bruteforce
        int [] nums = new int[nums1.length + nums2.length  ];

        for(int i = 0 ; i < nums1.length  ; i++){
            nums[i] = nums1[i];
        }
        int j = 0;
        for(int i = nums1.length ; i < nums1.length + nums2.length  ; i++){
            nums[i] = nums2[j];
            j+=1;
        }

        Arrays.sort(nums);

        if(nums.length % 2 == 0){
            int one = nums[nums.length/2] , two = nums[(nums.length/2) - 1];
            System.out.println(one + " " + two);
            return (double) (one + two) / 2 ;

        }else{
            return (double) nums[nums.length / 2];
            
        }
    }
}