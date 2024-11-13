public class RunningMedian {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
          PriorityQueue<Integer> minHeap = new PriorityQueue<>();
               PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
               ArrayList<Integer> result=new ArrayList<Integer>();
               for(int i=0;i<A.size();i++)
               {
                   int median=0;
                   maxHeap.add(A.get(i));
                  if(minHeap.size()<maxHeap.size())
                  {
                    int largeFromMinHeap=maxHeap.poll();
                     minHeap.add(largeFromMinHeap);
                  }
                 if(maxHeap.size()<minHeap.size())
                 {
                     int minFromMaxHeap=minHeap.poll();
                     maxHeap.add(minFromMaxHeap);
                 }
                      median=maxHeap.peek();
result.add(median);
               }
               return result;
    }
}
