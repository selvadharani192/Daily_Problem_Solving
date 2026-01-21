class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];
    do{
       slow = nums[slow];
       fast = nums[nums[fast]];
       }while(slow!=fast);
       
       int pointer = nums[0];
       while(pointer!=slow){
        slow = nums[slow];
        pointer = nums[pointer];
       }
       return slow;
    }
}