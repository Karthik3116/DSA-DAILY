# class Solution(object):
#     def partition(self, nums, low, high):
#         pivot = nums[high]  # Set pivot to be the last element
#         i = low - 1

#         for j in range(low, high):
#             if nums[j] < pivot:
#                 i += 1
#                 nums[i], nums[j] = nums[j], nums[i]

#         # Place pivot element in the correct position
#         nums[i + 1], nums[high] = nums[high], nums[i + 1]
#         return i + 1

#     def quick(self, nums, low, high):
#         if low < high:
#             pidx = self.partition(nums, low, high)
#             self.quick(nums, low, pidx - 1)
#             self.quick(nums, pidx + 1, high)

#     def sortArray(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """
#         self.quick(nums, 0, len(nums) - 1)
#         return nums

class Solution(object):
    def sortArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums.sort()
        return nums