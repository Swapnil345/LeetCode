class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=map.getOrDefault(nums[i],0);
            map.put(nums[i],temp+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}