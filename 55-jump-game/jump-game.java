class Solution {
    public boolean canJump(int[] nums) {
        // int maxReach=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i>maxReach){
        //         return false;
        //     }
        //     maxReach=Math.max(maxReach,i+nums[i]);
        // }
        // return true;
        int finalPosition=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=finalPosition){
                finalPosition=i;
            }
        }
        return finalPosition==0;
    }
}
