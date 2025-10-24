class Solution {
    public int hammingWeight(int n) {
       int count = 0;
       while(n!=0){
        if((n&1)==1){
            count++;
        }
        n=n>>1;   // right shift na it divides by two and left shift do the opposite
       } 

       return count;
    }
}