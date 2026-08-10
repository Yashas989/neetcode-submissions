class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}
        for i,num in enumerate(nums):
            if dic.get(target - num) is not None:
                return [dic[target-num], i]
            dic[num] = i