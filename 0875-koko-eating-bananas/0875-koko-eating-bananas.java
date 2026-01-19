class Solution {
    public int minEatingSpeed(int[] piles, int h) {
           int right = piles[piles.length-1];
              for (int pile : piles) {
            right = Math.max(right, pile);
        }
           int left =1;
           int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
          long timeTaken =  calculateTime(piles,mid);
            if(timeTaken<=h){
                result = mid;
                right = mid-1;
            }
            else if(timeTaken>h){
                left = mid+1;
            }
           
        }
        return result;
    }
    public long calculateTime(int[] piles,int numberOfBan){
        long timeTaken =0;
        for(int i=0;i<piles.length;i++){
          long hr =  piles[i]/numberOfBan;
          if( piles[i]%numberOfBan!=0){
            hr=hr+1;
          }
          timeTaken+=hr;
        }
       return timeTaken;
    }
}