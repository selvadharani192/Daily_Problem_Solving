class Solution {
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer,Integer> index = new HashMap<Integer,Integer>();
        int[] result = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            index.put(intervals[i][0],i);
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0;i<intervals.length;i++){
           int interval = binarySearch(intervals,i);
          
          result[index.get(intervals[i][0])] = interval!=-1?index.get(intervals[interval][0]):-1;
        }
        return result;
    }
    public int binarySearch(int[][] intervals,int searchElementIndex){
          int left =searchElementIndex;
          int right = intervals.length-1;
          int result=-1;
          while(left<=right){
            int mid = (left+right)/2;
            if(intervals[mid][0]>=intervals[searchElementIndex][1]){
                result= mid;
                 right = mid-1;
            }
            else{
                left=mid+1;
            }
          }
          return result;
    }
}