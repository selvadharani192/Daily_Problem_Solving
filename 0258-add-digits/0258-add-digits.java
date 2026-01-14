class Solution {
    public int addDigits(int num) {
        while(num > 9){
            num = sumDigit(num);
        }
        return num;
    }

    public int sumDigit(int num){
        int sum = 0;
        while(num > 0){
           sum += num % 10;
           num /= 10;
        }
        return sum;
    }
}