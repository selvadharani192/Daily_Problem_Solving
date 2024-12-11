public class SumOfAllSubArrays {
    public Long subarraySum(ArrayList<Integer> A) {
        Long sum=0l;
        for(int i=0;i<A.size();i++)
        {
            Long multiplier = (long)(i + 1) * A.size() - (long)i * (i + 1);
           sum+=(multiplier)*A.get(i);
        }
        return sum;
    }
}
