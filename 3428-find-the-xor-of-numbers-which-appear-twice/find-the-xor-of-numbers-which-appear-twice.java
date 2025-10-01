class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0;i<nums.length;i++){
            int temp=map.getOrDefault(nums[i],0);
            map.put(nums[i],temp+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])==2){
                    result^=nums[i];
                    map.remove(nums[i]);
                }
            }
        }
        return result;
    }
}