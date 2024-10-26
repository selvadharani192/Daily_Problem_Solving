import java.util.Collections;
public class UniquePairGivesDifferenceK {
    public int solve(ArrayList<Integer> A, int B) {
Collections.sort(A);
int leftPointer=0;
int rightPointer=1;
int count=0;
HashSet<String> duplicateCounter=new HashSet<String>();
while(rightPointer<A.size()&&leftPointer<A.size())
{
    int diff=getAbs(A.get(leftPointer),A.get(rightPointer));
    if(diff==B&&leftPointer!=rightPointer)
    {
    String pair=A.get(leftPointer)+","+A.get(rightPointer);
        if(!duplicateCounter.contains(pair)){
       count++;
       duplicateCounter.add(pair);
       
        }

      leftPointer++;
      rightPointer++;
            }
    else if(diff>B)
    {
        leftPointer++;
    }
    else 
    {
        rightPointer++;
    }
}
return count;
    }
public int getAbs(int A,int B)
{
    if(A>B)
    {
        return A-B;
    }
    return B-A;
}
}
