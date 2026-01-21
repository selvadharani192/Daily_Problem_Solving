class Solution {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];
     while(true){
       slow = nums[slow];
       fast = nums[nums[fast]];
       if(slow==fast){
        break;
       }
       }
       int pointer = nums[0];
       while(pointer!=slow){
        slow = nums[slow];
        pointer = nums[pointer];
       }
       return slow;
    }
}