class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set = new HashSet<>();
        // int left=0;
        // int maxSize=0;
        // for(int right=0;right<s.length();right++){
        //     while(set.contains(s.charAt(right))){
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     maxSize=Math.max(maxSize,right-left+1);
        // }
        // return maxSize;
        Set<Character> set=new HashSet<>();
        int left=0;
        int right=0;
        int maxSize=0;
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxSize=Math.max(maxSize,right-left+1);
            right++;
        }
        return maxSize;
    }
}