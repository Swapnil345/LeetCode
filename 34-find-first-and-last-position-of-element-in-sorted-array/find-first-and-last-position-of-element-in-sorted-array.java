class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                int left=mid;
                while(left>0&&nums[left-1]==target){
                    left--;
                }
                int right=mid;
                while(right<nums.length-1&&nums[right+1]==target){
                    right++;
                }
                ans[0]=left;
                ans[1]=right;
                return ans;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}