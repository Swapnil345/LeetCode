class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // int[] letterCounts = new int[26]; // For letters 'a' to 'z'

        // // Count letters in magazine
        // for (char c : magazine.toCharArray()) {
        //     letterCounts[c - 'a']++;
        // }

        // // Check if ransomNote letters are available in magazine
        // for (char c : ransomNote.toCharArray()) {
        //     if (letterCounts[c - 'a'] == 0) {
        //         return false; // Letter not available or used up
        //     }
        //     letterCounts[c - 'a']--;
        // }
        // return true; // All letters found

        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> ran=new HashMap<>();
        HashMap<Character,Integer> mag=new HashMap<>();
        boolean result=true;
        for(int i=0;i<ransomNote.length();i++){
            int temp=ran.getOrDefault(ransomNote.charAt(i),0);
            ran.put(ransomNote.charAt(i),temp+1);
        }

        for(int i=0;i<magazine.length();i++){
            int temp=mag.getOrDefault(magazine.charAt(i),0);
            mag.put(magazine.charAt(i),temp+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            if(ran.get(ransomNote.charAt(i))>mag.getOrDefault(ransomNote.charAt(i),0)){
                result=false;
            }
        }
        return result;
        }
    
}