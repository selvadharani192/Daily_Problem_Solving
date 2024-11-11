public class Solution {
    public ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
    ArrayList<Integer> heap = new ArrayList<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0;i<B.size();i++)
        {
          // if the current element index greater than A , then need to add into heap if the element is greater than min from heap , else return aready existing min
          // always maintain the heap size equals A
          if(i>A-1)
            {
                            if(heap.get(0)<B.get(i)){
                              insertIntoHeap(heap,B.get(i));
                             fetchMinFromHeap(heap);  
            }
 result.add(heap.get(0));
            } 
              // if the current element index equals the A , then add the element in to heap and then get the min
            else if(i==A-1)
            {
                                              insertIntoHeap(heap,B.get(i));
        result.add(heap.get(0));
            }
              // if the current element index is less than A , then add -1
            else
            {
                result.add(-1);
                insertIntoHeap(heap,B.get(i));
            }
        }
        return result;
    }
    public void insertIntoHeap(ArrayList<Integer> heap,Integer value)
    {
        heap.add(value);
       int insertionPoint=heap.size()-1;
       int swapper=0;
       while(insertionPoint>0)
       {
           int parent =(insertionPoint-1)/2;
           if(heap.get(parent)>heap.get(insertionPoint))
           {
             swapper=heap.get(parent);
             heap.set(parent,heap.get(insertionPoint));
             heap.set(insertionPoint,swapper);
             insertionPoint=parent;
           }
           else
           {
               break;
           }
       }
    }

    public Integer fetchMinFromHeap(ArrayList<Integer> heap)
    {
        if(heap.size()==0)
        {
            return -1;
        }
         int minimum=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int traversor=0;
        int swapper=0;
       while((traversor*2)+1<heap.size())
       {
           int leftNode=(traversor*2)+1;
           int rightNode=leftNode+1;
           int min=traversor;
           if(heap.get(leftNode)<heap.get(min))
           {
            min=leftNode;
           }
           if(rightNode<heap.size()&&heap.get(rightNode)<heap.get(min))
           {
            min=rightNode;
           }
           if(min!=traversor)
           {
              swapper=heap.get(min);
              heap.set(min,heap.get(traversor));
              heap.set(traversor,swapper);
              traversor=min;
           }
           else{
            break;
           }
       }
return minimum;
    }
}
