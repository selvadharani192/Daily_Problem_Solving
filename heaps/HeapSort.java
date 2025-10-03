public class HeapSort {
    public ArrayList<Integer> heapSort(ArrayList<Integer> A) {
        int swapper=0;
         for(int i=A.size()/2-1;i>=0;i--){
       heapify(A,i,A.size());
         }
       //   System.out.print(A);
      for(int i=A.size()-1;i>0;i--){
      swapper = A.get(0);
      A.set(0,A.get(i));
      A.set(i,swapper);
       heapify(A,0,i);
      }
      return A;
    }

    public void heapify(ArrayList<Integer> array,int root,int size)
    {
        int left=root*2+1;
        int right=left+1;
        int max=root;
        int swapper=0;
        if(left<size&&array.get(left)>array.get(max))
        {
            max=left;
        }
        if(right<size&&array.get(right)>array.get(max))
        {
            max=right;
        }
        if(max!=root)
        {
        swapper=array.get(max);
        array.set(max,array.get(root));
        array.set(root,swapper);
        heapify(array,max,size);
        }
          }
    }

