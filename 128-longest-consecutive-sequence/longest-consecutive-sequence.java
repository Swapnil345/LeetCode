class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int maxStreak=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int streak=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    streak++;
                }
                maxStreak=Math.max(maxStreak,streak);
            }
        }
        return maxStreak;
    }
}