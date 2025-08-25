// class Solution {
//     public String minWindow(String s, String t) {
//         if(s.length()<t.length()){
//             return "";
//         }
//         HashMap<Character,Integer> have=new HashMap<>();
//         HashMap<Character,Integer> need=new HashMap<>();
//         for(int i=0;i<t.length();i++){
//             have.put(t.charAt(i),0);
//             int f=need.getOrDefault(t.charAt(i),0);
//             need.put(t.charAt(i),f+1);
//         }
//         int left=0;
//         int right=0;
//         int minSize=0;
//         while(right<s.length()){

//         }
        
//     }
// }

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        
        // Build the need map
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
            have.put(c, 0);
        }

        int left = 0;
        int matched = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (need.containsKey(c)) {
                have.put(c, have.get(c) + 1);
                if (have.get(c).intValue() == need.get(c).intValue()) {
                    matched++;
                }
            }

            // Try to shrink window from the left when all characters matched
            while (matched == need.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                if (need.containsKey(leftChar)) {
                    if (have.get(leftChar).intValue() == need.get(leftChar).intValue()) {
                        matched--;
                    }
                    have.put(leftChar, have.get(leftChar) - 1);
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
