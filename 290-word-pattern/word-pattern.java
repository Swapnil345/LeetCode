class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(w)) {
                    if (wordToChar.get(w) != c) {
                        return false;
                    }
                }
                charToWord.put(c, w);
                wordToChar.put(w, c);
            }
        }
        
        return true;
        
    }
}