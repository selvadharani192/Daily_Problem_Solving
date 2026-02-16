class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for(int num:nums){
            if(freq.containsKey(num)){
              freq.put(num,freq.get(num)+1);  
            }
            else{
                freq.put(num,1);
            }
        }
 Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> freq.get(n1) - freq.get(n2));
       for (Integer key : freq.keySet()) {
  heap.add(key);
          if (heap.size() > k) heap.poll();    
}
 int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
    }
     return top;
    }
}