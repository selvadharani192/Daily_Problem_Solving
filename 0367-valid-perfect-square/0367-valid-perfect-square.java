class Solution {
    public boolean isPerfectSquare(int num) {
        int right = num/2;
        int left=1;
        if(num==1){
            return true;
        }
        while(left<=right){
          int mid = (left+right)/2;
                      long sq=(long)mid * (long)mid;

          if(sq== num){
            return true;
          }
          else if(sq<num){
          left = mid+1;
          }
          else{
            right = mid-1;
          }
        }
        return false;
    }
}