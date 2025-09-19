class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int numberOfZeros=0;
        int maxLength=0;
        while(left<=right&&right<nums.length){
            if(nums[right]==0){
                numberOfZeros++;
            }
            if(numberOfZeros<=k){
              if(right-left+1>maxLength){
                maxLength=right-left+1;
                System.out.print(left+":: "+right+"]");
              }
            }
            else{
                while(nums[left]!=0){
                     left++;
                }
                left++;
                numberOfZeros--;
            }
            right++;
        }
        return maxLength;
    }
}