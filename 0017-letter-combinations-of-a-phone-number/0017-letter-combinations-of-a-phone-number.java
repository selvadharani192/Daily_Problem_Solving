class Solution {
    private static Map<Character,String> dialPad = new HashMap<Character,String>();

    public List<String> letterCombinations(String digits) {
        dialPad.put('2',"abc");
        dialPad.put('3',"def");
        dialPad.put('4',"ghi");
        dialPad.put('5',"jkl");
        dialPad.put('6',"mno");
        dialPad.put('7',"pqrs");
        dialPad.put('8',"tuv");
        dialPad.put('9',"wxyz");

        List<String> result = new ArrayList<String>();
        generatePossibilities(0,"",digits,result);
        return result;
    }
    public void generatePossibilities(int index,String combination,String digits,List<String> combinations){
        if(combination.length()==digits.length()){
           combinations.add(combination);
           return;
        }
        if(index>=digits.length()){
            return;
        }
        char c= digits.charAt(index);
        String dialPadDigits = dialPad.get(c);
      char[] dialPadDigitsArr=  dialPadDigits.toCharArray();
        for(char ch:dialPadDigitsArr){
            generatePossibilities(index+1,combination+ch,digits,combinations);
        }
    }
}