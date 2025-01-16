public class DistributeCandies {
    public int candy(ArrayList<Integer> A) {
        ArrayList<Integer> candies=new ArrayList<Integer>(Collections.nCopies(A.size(), 1));
        int totalCandies=0;
        for(int i=1;i<A.size();i++)
        {
            if(A.get(i)>A.get(i-1))
            {
                if(candies.get(i)<=candies.get(i-1)){
                candies.set(i,candies.get(i-1)+1);
                }
                
            }
        }
        for(int j=A.size()-1;j>0;j--)
        {
            if(A.get(j-1)>A.get(j))
            {
             if((candies.get(j-1)<=candies.get(j)))
               candies.set(j-1,candies.get(j)+1);    
            }
        }
        for(int i=0;i<A.size();i++)
        {
         totalCandies+=candies.get(i);
        }
        return totalCandies;
    }
}
