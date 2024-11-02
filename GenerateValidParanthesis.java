public class GenerateValidParanthesis {
    public ArrayList<String> generateParenthesis(int A) {
         ArrayList<String> res=new ArrayList<String>();
         String s="";
         generateParenthesisOfGivenLength(A,0,0,res,s);
         return res;
    }
    public void generateParenthesisOfGivenLength(int A,int open,int close,ArrayList<String> res,String s)
    {
        if(open ==A&&close==A)
        {
            res.add(s);
            
            return;
        }
        if(open<A)
        {
            
            generateParenthesisOfGivenLength(A,open+1,close,res,s+"(");
           
        }
        if(close<open)
        {
           
                        generateParenthesisOfGivenLength(A,open,close+1,res,s+")");
           
        }
    }
}
