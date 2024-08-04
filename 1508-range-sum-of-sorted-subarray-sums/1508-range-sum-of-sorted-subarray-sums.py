class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        arr = []
        for i in range(n):
            sub = 0
            for j in range(i, n):
                sub += nums[j]
                arr.append(sub)
        arr.sort()
        return sum(arr[left - 1 : right]) % (10**9 + 7)