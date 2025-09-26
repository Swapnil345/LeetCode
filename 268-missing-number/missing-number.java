class Solution {
    public int missingNumber(int[] nums) {
        // int i=0;
        // while(i<arr.length){
        //     int correct=arr[i];
        //     if(arr[i]<arr.length&&arr[i]!=arr[correct]){
        //         int temp=arr[i];
        //         arr[i]=arr[correct];
        //         arr[correct]=temp;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // for(int j=0;j<arr.length;j++){
        //     if(arr[j]!=j){
        //         return j;
        //     }
        // }
        // return arr.length;

            int i=0;
            while(i<nums.length){
                int correct=nums[i];
                if(nums[i]<nums.length&&nums[i]!=nums[correct]){
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }
                else{
                    i++;
                }
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=j){
                    return j;
                }
            }
            return nums.length;
    }
}