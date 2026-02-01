class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        int i=0;
        int j=0;
        int maxLen=0;
       
           while(j<nums.length){
                        freq.put(nums[j], freq.getOrDefault(nums[j],0) + 1);

            
               int freqI =  freq.get(nums[j]);
            
                while(freq.get(nums[j]) > k){
                     
                freq.put(nums[i], freq.get(nums[i]) - 1);

                if(freq.get(nums[i]) == 0){
                    freq.remove(nums[i]);
                }

                i++;
                     
                
               
              
            }
             maxLen = Math.max(maxLen, j - i + 1);
            j++;
           }
          
        
         return maxLen;
    }
}