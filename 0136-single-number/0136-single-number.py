class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        count = {}
        for one in nums:
            if(one not in count):
                count[one] = 1
            else:
                count[one] += 1

        for key in count.keys():
            if(count[key] == 1):
                return key

        return 0

        