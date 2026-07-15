class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length]; 
        int resIDX=right;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[resIDX--] = nums[left]*nums[left];
                left++;
            }
            else{
                 result[resIDX--] = nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}