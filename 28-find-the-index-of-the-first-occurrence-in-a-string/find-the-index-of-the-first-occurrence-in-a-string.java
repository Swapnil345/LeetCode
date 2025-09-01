class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int start=0;
        int end=needle.length();
        while(end<=haystack.length()){
            String str=haystack.substring(start,end);
            if(str.equals(needle)){
                return start;
            }
            start++;
            end++;
        }
        return -1;
    }
}