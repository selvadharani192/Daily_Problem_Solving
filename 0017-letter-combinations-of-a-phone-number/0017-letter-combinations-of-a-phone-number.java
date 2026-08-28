class Solution {
    private static final Map<Character, String> dialPad = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        dialPad.put('2', "abc");
        dialPad.put('3', "def");
        dialPad.put('4', "ghi");
        dialPad.put('5', "jkl");
        dialPad.put('6', "mno");
        dialPad.put('7', "pqrs");
        dialPad.put('8', "tuv");
        dialPad.put('9', "wxyz");

        generatePossibilities(0, "", digits, result);
        return result;
    }

    private void generatePossibilities(
            int index,
            String combination,
            String digits,
            List<String> combinations) {

        // We have selected one character for every digit
        if (index == digits.length()) {
            combinations.add(combination);
            return;
        }

        String letters = dialPad.get(digits.charAt(index));

        for (char letter : letters.toCharArray()) {
            generatePossibilities(
                index + 1,
                combination + letter,
                digits,
                combinations
            );
        }
    }
}