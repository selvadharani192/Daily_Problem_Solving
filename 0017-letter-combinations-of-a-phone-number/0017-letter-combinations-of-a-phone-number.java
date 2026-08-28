class Solution {
    private final Map<Character, String> dialPad = Map.of(
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
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backtrack(0, new StringBuilder(), digits, result);
        return result;
    }

    private void backtrack(int index, StringBuilder combination,
                           String digits, List<String> result) {

        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        String letters = dialPad.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) {
            // Choose
            combination.append(ch);

            // Explore
            backtrack(index + 1, combination, digits, result);

            // Undo ← explicit backtracking
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}