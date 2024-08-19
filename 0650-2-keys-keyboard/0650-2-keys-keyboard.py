class Solution:
    def minSteps(self, n: int) -> int:
        steps = [0, 2]
        
        for i in range (3, n+1):
            for j in range (i//2, -1, -1):
                if i%j == 0:
                    steps.append(steps[j-1] + i//j)
                    break
        
        return steps[n-1]