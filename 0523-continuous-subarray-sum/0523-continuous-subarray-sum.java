class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> registry = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
          prefixSum  =prefixSum+nums[i];
          prefixSum = prefixSum%k;

          if(prefixSum==0&&i>0){
            return true;
          }
          if(registry.containsKey(prefixSum)&&i-registry.get(prefixSum)>=2){
            return true;
          }
           if(!registry.containsKey(prefixSum)){
            registry.put(prefixSum,i);
          }
      
        }
        return false;
    }
}