class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        """
        :type numBottles: int
        :type numExchange: int
        :rtype: int
        """

        s = numBottles
        while(numBottles >= numExchange):
            s += numBottles/numExchange
            numBottles =numBottles%numExchange + numBottles/numExchange
        
        return s