class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff=Integer.MAX_VALUE;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            // if(i>0&&nums[i]==nums[i-1]){
            //     continue;
            // }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==target){
                return sum;
            }
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            int diff=Math.abs(sum-target);
            if(diff<minDiff){
                minDiff=diff;
                ans=sum;}
            // }
            // while(left<right&&nums[left]==nums[left+1]){left++;}
            //     while(left<right&&nums[right]==nums[right-1]){right--;}
                // left++;
                // right--;
            

        }
    }
    
        return ans;
}
}