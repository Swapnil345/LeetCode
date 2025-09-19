class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];


        // int lmao=0;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]>nums[i+1]){
        //         lmao=i+1;
        //         break;
        //     }
        // }
        // return nums[lmao];
        

        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}