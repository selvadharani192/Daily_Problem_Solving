public class RotateMatrixBy90Degree {
    public void solve(ArrayList<ArrayList<Integer>> A) {

      // Take transpose
      for(int i=0;i<A.size();i++)
      {
          for(int j=i;j<A.size();j++)
          {
              int swapper;
              swapper=A.get(i).get(j);
              A.get(i).set(j,A.get(j).get(i));
              A.get(j).set(i,swapper);
          }
      }

      // Do swap first half of the column and the last half
     for(int j=0,k=A.size()-1;j<A.size()/2;j++,k--)
     {
         for(int i=0;i<A.size();i++)
         {
             int swapper=0;
             swapper=A.get(i).get(j);
             A.get(i).set(j,A.get(i).get(k));
             A.get(i).set(k,swapper);
         }
     }
    // any ways this can be gone to single loop by combining the logics but not in the mood
    }
}
    
