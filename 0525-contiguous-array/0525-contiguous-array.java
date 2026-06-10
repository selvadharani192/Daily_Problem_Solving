class Solution {
    public int findMaxLength(int[] nums) {
      int res = 0;
      int prefixSum = 0;
      HashMap<Integer,Integer> freq = new HashMap<>();
      freq.put(0,-1);
      for(int i=0;i<nums.length;i++){
      
        if(nums[i]==0){
prefixSum+=-1;
        }
        else{
            prefixSum+=1;
        }
       Integer idx = freq.get(prefixSum);
      if(idx==null){
        freq.put(prefixSum,i);
      }
      else{
        if(res<i-idx){
            res = i-idx;
        }
      }
      }
      return res;
    }
}