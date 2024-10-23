public class CountOfDivisors {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++)
        {
            result.add(getDivisorCount(A.get(i)));
        }
        return result;
    }
    public int getDivisorCount(int number)
    {
        int count=(number==1)?1:2;
        Double root=Math.sqrt(number);
        for(int i=2;i<=root;i++)
        {
       if(number%i==0)
       {
           if(i!=root)
count+=2;
       
       else
       {
count+=1;
       }
        }
        }
        return count;

    }
}
