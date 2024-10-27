public class FindTheFirstSubArrayGiveSumEqualsK {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> prefixSum = new ArrayList<Integer>();

        // find prefix sum bro
        prefixSum.add(0);
        for(int number:A)
        {
            prefixSum.add(prefixSum.get(prefixSum.size()-1)+number);
        }
        int left=0;
        int right=1;
while(right<prefixSum.size())
{
    if(prefixSum.get(right)-prefixSum.get(left)==B)
    {
        for(int i=left;i<right;i++)
        {
            result.add(A.get(i));
        }
        return result;
    }
    else if(B>prefixSum.get(right)-prefixSum.get(left))
    {
        right++;
    }
    else{
        left++;
    }
}
       result.add(-1);
       return result;
    }
}
