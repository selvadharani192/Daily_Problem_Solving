class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
      int upper =   findUpperBound(nums,target);
      int lower=  findLowerBound(nums,target);
   //   System.out.print(upper+" "+lower);
    if(lower==-1 || nums[lower]!=target){
        result[0]=-1;
        result[1]=-1;
        return result;
    }
    result[1]=upper-1;
    result[0]=lower;
      
      return result;
    }
    int findUpperBound(int[] array,int number){
        int left =0;
        int right = array.length-1;
        int mid=-1;
        int bound=array.length;
        while(left<=right){
            mid = (left+right)/2;
            if(array[mid]>number){
bound =mid;
right = mid-1;
            }
            else{
left = mid+1;
            }
        }
        return bound;
    }
    int findLowerBound(int[] array,int number){
        int left =0;
        int right = array.length-1;
        int mid=-1;
        int bound =-1;
        while(left<=right){
            mid = (left+right)/2;
            if(array[mid]>=number){
                bound = mid;
                right=mid-1;
            }
            else{
                left = mid+1;
            }
             
        }
        
        return bound;
    }
}