class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        larger, smaller = 0, 0
        if start > goal:
            larger = bin(start)[2:]
            smaller = bin(goal)[2:]
        else:
            larger = bin(goal)[2:]
            smaller = bin(start)[2:]
            
        flips = 0
        
        s, l = len(smaller), len(larger)
        for i in range(s):
            print(i, smaller[i], larger[i])
            if smaller[s-1-i] != larger[l-1-i]:
                flips += 1
                
        diff = len(larger) - len(smaller)
        
        
        for i in range (diff):
            if larger[i] == '1':
                flips += 1
                
        return flips