class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=map.getOrDefault(nums[i],0);
            map.put(nums[i],temp+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    //     int result = 0;
    // for (int i = 0; i < 32; i++) {
    //     int bitCount = 0;
    //     for (int num : nums) {
    //         bitCount += ((num >> i) & 1);
    //     }
    //     if (bitCount % 3 != 0) {
    //         result |= (1 << i);
    //     }
    // }
    // // Handle negative numbers.
    // return result;
    }
}