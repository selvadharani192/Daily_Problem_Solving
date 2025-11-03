class Solution {
    public List<String> generateParenthesis(int n) {
          List<String> result = new ArrayList<String>();
         generateParenthesis(n,"",0,0,result);
         return result;
    }

    public void generateParenthesis(int n,String s, int open,int close,List<String> ss){
        if(s.length()==n*2){
           ss.add(new String(s));
        }
        if(open<n){        generateParenthesis(n,s+'(',open+1,close,ss);
        }
        if(close<open)
        generateParenthesis(n,s+')',open,close+1,ss);

    }
}