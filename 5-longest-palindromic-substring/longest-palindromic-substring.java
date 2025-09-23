class Solution {
    public String longestPalindrome(String s) {
         String longest="";
         for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                if(isPalindrome(sub)&&sub.length()>longest.length()){
                    longest=sub;
                }
            }
         }
         return longest;
    }
    public boolean isPalindrome(String sub){
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            if(sub.charAt(left++)!=sub.charAt(right--)){
                return false;
            }
            
        }
        return true;
    }
}