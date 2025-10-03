public class SumOfSubArrayOfSizeBequalsC {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int sum=0;
        for(int i=0;i<B;i++)
        {
        sum+=A.get(i);
        }
        if(sum==C)
        {
            return 1;
        }
        for(int i=B;i<A.size();i++)
        {
            sum=sum-A.get(i-B);
            sum+=A.get(i);
         //   System.out.print(sum+"*");
            if(sum==C)
            {
                return 1;
            }
        }
        return 0;
    }
}
