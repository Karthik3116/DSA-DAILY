class Solution:
    def moveZeroes(self, nums: List[int]) -> None:

        count = 0
        for idx in range(len(nums)):
            if(nums[idx] == 0):
                count += 1
            else:
                nums[idx - count] , nums[idx] = nums[idx] , nums[idx - count]