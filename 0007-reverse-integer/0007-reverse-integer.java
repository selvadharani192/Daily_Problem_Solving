class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int manipulationVariable = x;
        if (x < 0) {
            manipulationVariable = manipulationVariable * -1;
        }
        while (manipulationVariable > 0) {
            try {
                reverse = Math.addExact(Math.multiplyExact(reverse, 10), manipulationVariable % 10);
            } catch (Exception e) {
                return 0;
            }
            manipulationVariable = manipulationVariable / 10;
        }
        if (x < 0) {
            reverse = reverse * -1;
        }
        return reverse;
    }
}