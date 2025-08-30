class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
      int numberOfDigits =  findNumberOfDigits(x); 
      System.out.print(numberOfDigits);
      while(numberOfDigits>1){
        int divisor = (int) Math.pow(10, numberOfDigits - 1);
       int firstDigit = x / divisor;
      int lastDigit =  x%10;
       if(firstDigit!=lastDigit){
         return false;
       }
        x%=divisor;
        x/=10;
        numberOfDigits-=2;
      }
     
      return true;
    }

    private int findNumberOfDigits(int number){
        int numberOfDigits = 0 ;
        while(number>0){
             number=number/10;
             numberOfDigits++;
        }
        return numberOfDigits;
    }
}