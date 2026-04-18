class Solution {
    public int mirrorDistance(int n) {
      int rev =   reverse(n);
      return Math.abs(n-rev);
    }

    int reverse(int n){
        int reverse =0;
        while(n>0){
            int remainder = n%10;
            reverse = reverse*10+remainder;
             n=n/10;
        }
        return reverse;
    }
}