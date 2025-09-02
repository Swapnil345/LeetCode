class Solution {
    public int findMin(int[] nums) {
        int lmao=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                lmao=i+1;
                break;
            }
        }
        return nums[lmao];
    }
}