class Solution:
    def maxDistance(self, arrays: List[List[int]]) -> int:
        minNum = float('inf')
        maxNum = float('-inf')
        minIndex, maxIndex = 0, 0
        secondBig, secondSmall = 0, 0
        
        for i in range(len(arrays)):
            if arrays[i][0] <= minNum:
                secondSmall = minNum
                minNum = arrays[i][0]
                minIndex = i
            elif (arrays[i][0] <= secondSmall):
                secondSmall = arrays[i][0]
                
            if arrays[i][-1] >= maxNum:
                secondBig = maxNum
                maxNum = arrays[i][-1]
                maxIndex = i
            elif (arrays[i][-1] >= secondBig):
                secondBig = arrays[i][-1]
        
        if (minIndex == maxIndex):
            return max(abs(minNum - secondBig), abs(maxNum - secondSmall))
        
        return abs(minNum - maxNum)