class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                // If current character already mapped, check if it matches
                if (map.get(c1) != c2) return false;
            } else {
                // If c2 already mapped to another character, return false
                if (mappedChars.contains(c2)) return false;

                // Create new mapping
                map.put(c1, c2);
                mappedChars.add(c2);
            }
        }
        return true;
    }
}