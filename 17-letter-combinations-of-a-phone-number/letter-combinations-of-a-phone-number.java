import java.util.*;

public class Solution {
    private static final Map<Character, String> DIGIT_TO_LETTERS = Map.of(
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuilder path, String digits, int index) {
        if (path.length() == digits.length()) {
            combinations.add(path.toString());
            return;
        }
        String possibleLetters = DIGIT_TO_LETTERS.get(digits.charAt(index));
        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(combinations, path, digits, index + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
