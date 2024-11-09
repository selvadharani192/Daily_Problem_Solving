public class Solution {
    ArrayList<Integer> heap = new ArrayList<Integer>();
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> min=new ArrayList<Integer>();
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i).get(0)==1){
                int mini=getMinFromHeap();
              min.add(mini); 
            }
            else
            {
             pushToHeap(A.get(i).get(1));
            }
        }
        return min;
    }
     // This method is used to push elements into minheap and do heapify (heapify from bottom)
    public void pushToHeap(Integer element)
    {
        heap.add(element);
        int index=heap.size()-1;
        while(index>0)
        {
            int parentIndex=(index-1)/2;
            int swapper=0;
             if(parentIndex>=0)
             {
                if(heap.get(index)<heap.get(parentIndex))
                {
                   swapper = heap.get(index);
                   heap.set(index,heap.get(parentIndex));
                   heap.set(parentIndex,swapper);
                }
                else{
                    break;
                }
             }
             index=parentIndex;
        }
    }
  // This method is used to pop minimum element and heapify again (heapify from top)
    public Integer getMinFromHeap()
    {
        if(heap.size()>0){
       Integer min = heap.get(0);
       Integer lastElement=heap.get(heap.size()-1);
       int swapper=0;
       heap.set(0,lastElement);
       heap.remove(heap.size()-1);
       Integer traversor=0;
       while((traversor*2+1)<heap.size())
       {
           int left=(traversor*2)+1;
           int right=left+1;
           int minimum=traversor;
          if(heap.get(minimum)>heap.get(left))
          {
              minimum=left;
          }
           if(right<heap.size()&&heap.get(minimum)>heap.get(right))
           {
               minimum=right;
           }
           
           if(minimum==traversor)
           break;

           swapper=heap.get(minimum);
           heap.set(minimum,heap.get(traversor));
           heap.set(traversor,swapper);
           traversor=minimum;
       }
        return min;
    }
        return -1;

    }
}
