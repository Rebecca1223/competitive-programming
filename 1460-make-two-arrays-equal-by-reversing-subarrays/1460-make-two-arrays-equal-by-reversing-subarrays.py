class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        if target == arr:
            return True
        
        if len(target) != len(arr):
            return False
        
        targetMap = {}
        
        for i in range(len(target)):
            if target[i] in targetMap:
                targetMap[target[i]] += 1
                if targetMap[target[i]] == 0:
                    del targetMap[target[i]]
            else:
                targetMap[target[i]] = 1
                
            if arr[i] in targetMap:
                targetMap[arr[i]] -= 1
                if targetMap[arr[i]] == 0:
                    del targetMap[arr[i]]
            else:
                targetMap[arr[i]] = -1
        
        return not targetMap
        