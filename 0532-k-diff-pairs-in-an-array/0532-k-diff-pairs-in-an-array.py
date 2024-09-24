class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        freq = Counter(nums)
        count = 0

        for num in freq:
            if k > 0 and num+k in freq or k == 0 and freq[num] > 1:
                count += 1

        return count
        