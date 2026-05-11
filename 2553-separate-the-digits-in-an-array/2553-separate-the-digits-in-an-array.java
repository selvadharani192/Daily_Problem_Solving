class Solution {
    public int[] separateDigits(int[] nums) {
     ArrayList<Integer> digitsArr = new ArrayList<Integer>();
     for(int i=nums.length-1;i>=0;i--){
        int dig = nums[i];
        while(dig>0){
        digitsArr.add(dig%10);
        dig/=10;
        }
     } 
     int[] res = new int[digitsArr.size()];
     int itr=0;
     for(int i=digitsArr.size()-1;i>=0;i--){
      res[itr++]=digitsArr.get(i);
     }
        
        return res;
    }
}