class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<int[]>();

        for(int[] interval:intervals){
            if(newInterval[1]<interval[0]){
result.add(newInterval);
newInterval = interval; 
            }
            else if(newInterval[0]>interval[1]){
                result.add(interval);
            }
            else{
               newInterval[0] = Math.min(interval[0],newInterval[0]);
               newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}