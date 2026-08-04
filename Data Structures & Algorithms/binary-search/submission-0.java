class Solution {
    public int search(int[] nums, int target) {
                int l=0,r=nums.length-1;
        int mid = 0;
        while(l<=r){
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid-1;
            else
                l = mid+1;
            mid = (l+r)/2;
        }
        return -1;
    }
}
