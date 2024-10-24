# Problem statement 
# You will be given an array which is sorted in ascending order and a number , the task is to count the number of pairs in array will form K where pair should be formed from different element


  import java.lang.Math;
public class PairSumInArrayEqualsK {
    public int solve(ArrayList<Integer> A, int B) {
      HashMap<Integer,Integer> count=new HashMap<Integer,Integer>();
      int result=0;
     int normalizer =(int)Math.pow(10,9)+7;
      for(int i=0;i<A.size();i++)
      {
          int pair=B-A.get(i);
          if(count.containsKey(pair))
          {
              result=(result+count.get(pair))%normalizer;
          }
count.merge(A.get(i), 1, Integer::sum);
      }
      return result;
    }
   
}
