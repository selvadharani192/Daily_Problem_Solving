class Solution {
    public int subarraySum(int[] nums, int k) {
       int prefixSum = 0;
       Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
         freq.put(0, 1); 
       int outPut = 0;
       for(int i=0;i<nums.length;i++){
        prefixSum+=nums[i];
        if(freq.get(prefixSum-k)!=null){
           outPut+=freq.get(prefixSum-k);
        }
        if(freq.containsKey(prefixSum)){
            freq.put(prefixSum,freq.get(prefixSum)+1);
        }
        else{
            freq.put(prefixSum,1);
        }

       }
       return outPut;
    }
}