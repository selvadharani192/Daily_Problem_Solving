class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frequency   = new int[101];
        int output=0;
        int maxFreq=0;
        for(int i=0;i<nums.length;i++){
            frequency[nums[i]]++;
            if(  frequency[nums[i]]>maxFreq){
               maxFreq= frequency[nums[i]];
            //   System.out.print(nums[i]+" ");
            }
        }  
        for(int i=1;i<=100;i++){
            if(frequency[i]==maxFreq){
               output+=frequency[i];
            }
        }
        return output;
          }
}