class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        i = 1
        result =[0 for i in range(len(nums))]
        result[0]=1
        for i in range (1,len(nums)) :
            result[i]=nums[i-1]*result[i-1]
        s=1
        for i in range(len(nums)-1,-1,-1) :
            result[i]*result[i]*s
            s=s*nums[i]
        return result
