class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
      
        int globalMax = 0;

        for(int num:set){
          if(!set.contains(num-1)){
           int max=1;
          int copy = num;
          while(set.contains(copy+1)){
            max++;
             copy++;
          }
         globalMax = Math.max(max,globalMax);
         
        }
        }
        return globalMax;
    }
}