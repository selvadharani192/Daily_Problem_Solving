class Solution {
    public int subsetXORSum(int[] nums) {
      int sum =  subSetXORSum(0,nums,0,0);
      return sum;
    }

    int subSetXORSum(int sum,int[] nums,int traversor,int totalSum){
      if(traversor==nums.length){
          totalSum+=sum;
        return totalSum;
      }
    return  subSetXORSum(sum^nums[traversor],nums,traversor+1,totalSum)+ subSetXORSum(sum,nums,traversor+1,totalSum);
     

    }
}