public class Solution {
    public int solve(ArrayList<Integer> A) {
       ArrayList<Integer> heap=new ArrayList<Integer>();
       int totalCost=0;
       for(int i=0;i<A.size();i++)
       {
           insertIntoHeap(heap,A.get(i));
       }
       while(heap.size()>1){
      int connectingRopesIndex=getMin(heap);
      int nextRope=getMin(heap);
        int currentCost=0;
        if(nextRope!=-1){
       currentCost=connectingRopesIndex+nextRope;
        }
        else{
           currentCost= connectingRopesIndex;
        }
      totalCost+=currentCost;
      
      insertIntoHeap(heap,currentCost);
       }
       return totalCost;
    }
// This method is used to insert the value in to min heap
    public void insertIntoHeap(ArrayList<Integer> heap,Integer value)
    {
        heap.add(value);
        int insertionIndex=heap.size()-1;
        int swapper=0;
        while(insertionIndex>0)
        {
            int parent=(insertionIndex-1)/2;
            if(heap.get(insertionIndex)<heap.get(parent))
            {
               swapper=heap.get(insertionIndex);
               heap.set(insertionIndex,heap.get(parent));
               heap.set(parent,swapper);
               insertionIndex=parent;
            }

else
{
    break;
}
        }

    }

  // This method will remove the minimum element from the heap and return it
    public Integer getMin(ArrayList<Integer> heap)
    {
        if(heap.size()==0)
        {
            return -1;
        }
      int min=heap.get(0);
      heap.set(0,heap.get(heap.size()-1));
      heap.remove(heap.size()-1);
      int traversor=0;
      int swapper=0;
      while((traversor*2)+1<heap.size())
      {
          int leftNode=traversor*2+1;
          int rightNode=leftNode+1;
          int minimum=traversor;
          if(heap.get(leftNode)<heap.get(minimum))
          {
              minimum=leftNode;
          }
          if(rightNode<heap.size()&&heap.get(rightNode)<heap.get(minimum))
          {
              minimum=rightNode;
          }
          if(traversor!=minimum)
          {
            swapper=heap.get(traversor);
            heap.set(traversor,heap.get(minimum));
            heap.set(minimum,swapper);
            traversor=minimum;
          }
          else{
              break;
          }
      }
      return min;
    }

}

