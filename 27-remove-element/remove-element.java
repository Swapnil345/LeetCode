class Solution {
    public int removeElement(int[] nums, int val) {
        // int i=0;
        // int count=0;
        // while(i<nums.length-count){
        //     if(nums[i]==val){
        //         int temp=nums[i];
        //         nums[i]=nums[nums.length-1-count];
        //         nums[nums.length-1-count]=temp;
        //         count++;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return nums.length-count;
        // int i=0;
        // int j=nums.length-1;
        // while(i<j){
        //     if(nums[i]==val){
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         j--;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return nums.length-i;
        int i = 0, n = nums.length;
while (i < n) {
    if (nums[i] == val) {
        nums[i] = nums[n - 1];
        n--;
    } else {
        i++;
    }
}
return n;

    }
}