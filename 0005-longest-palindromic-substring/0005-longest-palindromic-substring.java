class Solution {
    public String longestPalindrome(String s) {
        int maxLen=1;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
          int len=  Math.max(isPalindrome(s,i,i),isPalindrome(s,i,i+1));  
          if(len>maxLen){
          start = i - (len-1)/2;
          end = i+len/2;
          maxLen = len;
          }
        }
       String res = "";
       for(int i=start;i<=end;i++){
        res+=s.charAt(i);
       }
       return res;
    }
    public int isPalindrome(String s,int start,int end){
      
         while(start>=0&&end<s.length()){
            if(s.charAt(start)==s.charAt( end)){
                start--;
                end++;
             continue;
            }
            else{
                break;
            }
          

         }
         return end-start-1;
    }
}