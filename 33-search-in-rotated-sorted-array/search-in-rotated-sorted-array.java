class Solution {
    public int search(int[] nums, int target) {
        int peak=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                peak=i;
            }
        }
        int left=0;
        int right=peak;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        left=peak+1;
        right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}