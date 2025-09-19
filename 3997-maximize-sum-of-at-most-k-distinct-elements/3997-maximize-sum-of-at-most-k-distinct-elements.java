
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
      List<Integer> result = new ArrayList<Integer>();
       result.add(nums[nums.length-1]);
       int resultindex=1;
       for(int i=nums.length-2;i>=0&&resultindex<k;i--){
        if(nums[i]<nums[i+1]){
            resultindex++;
           result.add(nums[i]);
        }
       } 
       return result.stream().mapToInt(Integer::intValue).toArray();
    }
}