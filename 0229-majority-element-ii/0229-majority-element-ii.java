class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,Integer> majorityTracker = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           if(majorityTracker.containsKey(nums[i])){
            majorityTracker.put(nums[i],majorityTracker.get(nums[i])+1);
           }
           else{
            majorityTracker.put(nums[i],1);
           }
          
        }
         for(int i=0;i<nums.length;i++){
              if(majorityTracker.containsKey(nums[i]) && majorityTracker.get(nums[i])>(nums.length/3)){
result.add(nums[i]);
majorityTracker.remove(nums[i]);
         }
         }
         return result;
    }
}