class Solution {
    public int climbStairs(int n) {
      int step1=1;
      int step2=2;
      int temp=0;
      for(int i=3;i<=n;i++){
          temp=step2;
          step2=step1+step2;
          step1=temp;
      }
      return n==1?step1:step2;
    }

  
}