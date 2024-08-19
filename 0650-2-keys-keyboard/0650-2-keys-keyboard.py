class Solution:
    def minSteps(self, n: int) -> int:
        steps = [0, 2, 3, 4, 5, 5, 7, 6]
        
        for i in range (9, n+1):
            for j in range (i-1, -1, -1):
                if i%j == 0:
                    steps.append(steps[j-1] + i//j)
                    break
        
        return steps[n-1]